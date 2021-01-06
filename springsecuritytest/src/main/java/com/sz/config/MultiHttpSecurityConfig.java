package com.sz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 配置多个HttpSecurity时， MultiHttpSecurityConfig 不需要继承 WebSecurityConfigurerAdapter,
 * 在 MultiHttpSecurityConfig 中创建静态内部类继承 WebSecurityConfigurerAdapter 即可，
 * 静态内部类上添加＠Configuration 注解和＠Order 注解，＠Order 注解表示该配置的优先级，数字
 * 越小优先级越大，未加＠Order 注解的配置优先级最小 。
 */
//@Configuration
public class MultiHttpSecurityConfig {

//    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

//    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
            .withUser("admin").password("123").roles("ADMIN","USER")
            .and()
            .withUser("sang").password("123").roles("USER");
    }

//    @Configuration
//    @Order(1)
    public static class AdminSecurityConfig extends WebSecurityConfigurerAdapter{
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //表示该类主要用来处理"/admin/**"模式的url
            http.antMatcher("/admin/**").authorizeRequests().anyRequest().hasRole("ADMIN");
        }
    }

//    @Configuration
    public static class OtherSecurityConfig extends WebSecurityConfigurerAdapter{
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //表示该类主要用来处理其他的url
            http.authorizeRequests().anyRequest().authenticated()
            .and()
            .formLogin().loginProcessingUrl("/login").permitAll()
            .and()
            .csrf()
            .disable()
            ;
        }
    }

}
