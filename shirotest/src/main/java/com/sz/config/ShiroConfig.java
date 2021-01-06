package com.sz.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
    /**
     * Realm可以是自定义 Realm，也可以是 Shiro提供的 Realm，简单起见，本案例没有配直数据库连接，
     * 这里直接配直了两个用户： sang/123 和 admin/123，分别对应角色 user和admin,
     * user具有 read 权限， admin 则具有 read 、 write 权限。
     * @return
     */
    @Bean
    public Realm realm(){
        TextConfigurationRealm realm = new TextConfigurationRealm();
        realm.setUserDefinitions("sang=123,user\n admin=123,admin");
        realm.setRoleDefinitions("admin=read,write\n user=read");
        return realm;
    }

    /**
     * ShiroFilterChainDefinition Bean中配置了基本的过滤规则，
     * "/login"和"/doLogin"可以匿名访问，"/logout"是一个注销登录请求，
     * 其余请求则都需要认证后才能访问 。
     * @return
     */
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(){
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/login","anon");
        chainDefinition.addPathDefinition("/doLogin","anon");
        chainDefinition.addPathDefinition("/logout","logout");
        chainDefinition.addPathDefinition("/**","authc");
        return chainDefinition;
    }

    /**
     * 为了支持在Thymeleaf中使用Shiro标签，如果不在Thymeleaf中使用Shiro标签，可以不提供
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }
}
