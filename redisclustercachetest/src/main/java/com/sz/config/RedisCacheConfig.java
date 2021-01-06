package com.sz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisCacheConfig {
    /*
    在配置Redis集群时，已经向 Spring 容器中注册了一个JedisConnectionFactory的实例，
    这里 将之注入到 RedisCacheConfig 配直文件中备用（ RedisConnectionFactory 是
    JedisConnectionFactory的父类）。
     */
    @Qualifier("jedisConnectionFactory")
    @Autowired
    RedisConnectionFactory connectionFactory;

    /*在 RedisCacheConfig 中提供 RedisCacheManager 的实例，
    该实例的构建需要三个参数，
    第一个参数是一个 cacheWriter，直接通过nonLockingRedisCacheWriter 方法构造出来即可；
    第二个参数是默认的缓存配置；
    第三个参数是提前定义好的缓存配置。
     */
    @Bean
    RedisCacheManager redisCacheManager(){
        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
        RedisCacheConfiguration redisCacheConfiguration =
                RedisCacheConfiguration.defaultCacheConfig()
                .prefixKeysWith("sz:") // 设置了key的前缀为sz:
                .disableCachingNullValues() //禁止缓存一个null
                .entryTtl(Duration.ofMinutes(30));//设置缓存的过期时间为30分钟
        configMap.put("c1",redisCacheConfiguration);
        RedisCacheWriter cacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(connectionFactory);

        /*
        RedisCacheManager 构造方法中第三个参数是一个提前定义好的缓存参数，
        它是一个 Map 类型的参数，该 Map 中的 key 就是指缓存名字，
        value 就是该名称的缓存所对应的缓存自己值，
        例如 key 的前缀、缓存过期时间等，若缓存注解中使用的缓存名称不存在于 Map 中，
        则使用 RedisCacheManager 构造方法中第二个参数所定义的缓存策略进行数据缓存。
        例如如下两个缓存配置：
        @Cacheable(value = "c1")
        @Cacheable(value = "c2")
        第l行的注解中，cl存在于configMap集合中，因此使用的缓存策略是configMap集合中cl所对应的缓存策略，
        c2不存在于configMap集合中，因此使用的缓存策略是，默认的缓存策略。
         */
        RedisCacheManager redisCacheManager = new RedisCacheManager(
                cacheWriter,RedisCacheConfiguration.defaultCacheConfig(),configMap);
        return redisCacheManager;
    }
}
