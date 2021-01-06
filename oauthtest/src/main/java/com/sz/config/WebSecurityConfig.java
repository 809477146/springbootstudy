package com.sz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 在 Spring Security 配置和资源服务器配置中，一共涉及两个 HttpSecurity，其中 Spring Security 中的配置优先级高于资源服务器中的配置，即请求地址先经过
 * Spring Security 的 HttpSecurity，再经过资源服务器的 HttpSecurity 。
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 这里两个 Bean 将注入授权服务器配置类中使用
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return super.userDetailsService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("$2a$10$VCbMxqVmFIMhE3iuPWqi0ODy/2ZyZn/pyf1Ox8xobgJc1zjPcMCFu")
                .roles("admin")
                .and()
                .withUser("sang")
                .password("$2a$10$BPkJND84NzkTswlFbpoV2u1DJRV12A0SVU6BpFztmwrxNh6a8CLny")
                .roles("user");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置"/oauth/**"模式的 URL，这一类的请求直接放行
        http.antMatcher("/oauth/**").authorizeRequests()
                .antMatchers("/oauth/**").permitAll()
                .and()
                .csrf().disable();
    }
}
