package com.sz.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 单个HttpSecurity
 */
//@Configuration
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    //配置用户
//    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("123").roles("ADMIN","USER")
                .and()
                .withUser("sang").password("123").roles("USER")
                .and()
                .withUser("root").password("123").roles("ADMIN","DBA");
    }

//    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() //调用authorizeRequests()方法开启HttpSecurity的配置
                .antMatchers("/admin/**")
                .hasRole("ADMIN") //访问/admin/**模式的url必须具备ADMIN的角色
                .antMatchers("/user/**")
                .access("hasAnyRole('ADMIN','USER')")//访问/user/**模式的url必须具备ADMIN或USER的角色
                .antMatchers("/db/**")
                .access("hasRole('ADMIN') and hasRole('DBA')")//访问/db/**模式的url必须具备ADMIN和DBA的角色
                .anyRequest().authenticated() //表示出了前面定义的url模式之外，用户访问其他的url都必须认证后访问（登录后访问）
                .and()
                /*
                开启表单登陆，即读者一开始看到的登录页面，同时配直了登录接口为 "/login”，
                即可以直接调用“／login”接口，发起一个 POST 请求进行登录，登录参数中用户 名必须命名为username，
                密码必须命名为password，配置 loginProcessingUrl 接口主要是方便Ajax或者移动端调用登录接口。
                最后还配置了 permitAll，表示和登录相关的接口都不需要认证即可访问。
                 */
                .formLogin()
                .loginPage("/login_page") //配置登陆页面，配置了loginPage后，如果用户未获授权就访问一个需要授权才能访问的接口，就会自动跳转到login_page页面让用户登录，这个login_page就是开发者自定义的登录页面，而不再是Spring Security提供的默认登录页 。
                .loginProcessingUrl("/login")//登录请求处理接口，无论是自定义登录页面还是移动端登录，都需要使用该接口
                .usernameParameter("name")//定义了认证所需的用户名和密码的参数名，默认用户名username，密码password，可自定义
                .passwordParameter("passwd")
                /*
                定义了登录成功的处理逻辑。用户登录成功后可以跳转到某一个页面，也可以返回一段 JSON，这个要看具体业务逻辑，
                本案例假设是第二种，用户登录成功后，返回一段登录成功的 JSON。onAuthenticationSuccess方法的第三个参数
                一般用来获取当前登录用户的信息，在登录成功后， 可以获取当前登录用户的信息一起返回给客户端。
                 */
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        Object principal = authentication.getPrincipal();
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        httpServletResponse.setStatus(200);
                        Map<String,Object> map = new HashMap<>();
                        map.put("status",200);
                        map.put("msg",principal);
                        ObjectMapper om = new ObjectMapper();
                        out.write(om.writeValueAsString(map));
                        out.flush();
                        out.close();
                    }
                })
                /*
                定义了登录失败的处理逻辑，和登录成功类似，不同的是，登录失败的回调方法里有一个AuthenticationException参数，
                通过这个异常参数可以获取登录失败的原因，进而给用户一个明确的提示。
                 */
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter out = httpServletResponse.getWriter();
                        httpServletResponse.setStatus(401);
                        Map<String,Object> map = new HashMap<>();
                        map.put("status",401);
                        if (e instanceof LockedException){
                            map.put("msg","账户被锁定，登陆失败！");
                        }
                        else if(e instanceof BadCredentialsException){
                            map.put("msg","账户名或密码输入错误，登陆失败！");
                        }
                        else if(e instanceof DisabledException){
                            map.put("msg","账户被禁用，登陆失败！");
                        }
                        else if(e instanceof AccountExpiredException){
                            map.put("msg","账户已过期，登陆失败！");
                        }
                        else if(e instanceof CredentialsExpiredException){
                            map.put("msg","密码已过期，登陆失败！");
                        }
                        else {
                            map.put("msg","登陆失败！");
                        }
                        ObjectMapper om = new ObjectMapper();
                        out.write(om.writeValueAsString(map));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()
                .and()
                .logout()//表示开启注销登陆配置
                .logoutUrl("/logout")//配置注销登陆请求url为"/logout"，默认也是"/logout"
                .clearAuthentication(true)//是否清除身份认证信息，默认为true，表示清除
                .invalidateHttpSession(true)//是否使session失效，默认为true
                //配置一个LogoutHandler，开发者可以在LogoutHandler中完成一些数据清除工作，例 如Cookie的清除
                .addLogoutHandler(new LogoutHandler() {
                    @Override
                    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {

                    }
                })
                //配置一个LogoutSuccessHandler，开发者可以在这里处理注销成功后的业务逻辑，例如返回一段JSON提示或者跳转到登录页面等
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        httpServletResponse.sendRedirect("/login_page");
                    }
                })
                .and()
                //表示关闭csrf
                .csrf().disable();

    }
}
