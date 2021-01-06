package com.sz.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 在HttpSecurity中配置所有的Endpoint都需要具有ADMIN角色才能访问，同时开启HttpBasic认证。
 * 注意，EndpointRequest.toAnyEndpoint()表示匹配所有的Endpoint，例如shutdown、mappings、
 * health等，但是不包括开发者通过＠RequestMapping注解定义的接口
 */
@Configuration
public class ActuatorSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatcher(EndpointRequest.toAnyEndpoint())
                .authorizeRequests()
                .anyRequest().hasRole("ADMIN")
                .and()
                .httpBasic();
    }
}
