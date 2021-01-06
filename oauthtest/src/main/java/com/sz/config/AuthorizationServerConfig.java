package com.sz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * 授权服务器配置
 * 自定义类继承自 AuthorizationServerConfigurerAdapter，完成对授权服务器的配置，然后通过 @EnableAuthorizationServer 注解开启授权服务器。
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Autowired
    AuthenticationManager authenticationManager;//用来支持password模式
    @Autowired
    RedisConnectionFactory redisConnectionFactory;//用来完成Redis缓存，将令牌信息存储到redis缓存中
    @Autowired
    UserDetailsService userDetailsService;//为刷新token提供支持
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();//密码加密
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("password")
                .authorizedGrantTypes("password","refresh_token")//授权模式，标准的OAuth 2协议不包括refresh_token，但是在 Spring Security 的实现中将其归为一种， 因此如果要实现 access_token 的刷新，就需要添加这样一种授权模式
                .accessTokenValiditySeconds(1800)//token的过期时间
                .resourceIds("rid")//配置的资源id
                .scopes("all")
                .secret("$2a$10$VCbMxqVmFIMhE3iuPWqi0ODy/2ZyZn/pyf1Ox8xobgJc1zjPcMCFu");//加密后的密码
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(new RedisTokenStore(redisConnectionFactory))
                .authenticationManager(authenticationManager)
                .userDetailsService(userDetailsService);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients();//支持client_id和client_secret
    }
}
