package com.sz.config;

import com.sz.entity.Menu;
import com.sz.entity.Role;
import com.sz.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * 开发者自定义 FilterInvocationSecurityMetadataSource 主要实现该接口中的 getAttributes 方法，
 * 该方法的参数是一个 FilterInvocation，开发者可以从 FilterInvocation 中提取出当前请求的URL，
 * 返回值是 Collection<ConfigAttribute>，表示当前请求URL所需的角色。
 */
@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    AntPathMatcher antPathMatcher = new AntPathMatcher(); //创建一个AntPathMatcher，主要用来实现ant风格的URL匹配
    @Autowired
    MenuMapper menuMapper;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();//从参数中提取出当前请求的url
        List<Menu> allMenus = menuMapper.getAllMenus();//从数据库获取所有的资源信息，即menu表以及menu对应的role，在真实项目环境中，可以将资源信息缓存在redis或者其他缓存数据库中。
        //遍历过程稿获取当前请求的url所需要的角色信息并返回。如果当前请求的url在资源表中不存在相应的模式，就假设该请求登录后即可访问。即直接返回ROLE_LOGIN
        for (Menu menu : allMenus) {
            if (antPathMatcher.match(menu.getPattern(),requestUrl)){
                List<Role> roles = menu.getRoles();
                String[] roleArr = new String[roles.size()];
                for (int i = 0; i < roleArr.length; i++){
                    roleArr[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(roleArr);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    /*
        getAllConfigAttributes方法用来返回所有定义好的权限资源，Spring Security在启动时会校验相关配置是否正确，
        如果不需要校验，那么该方法直接返回 null 即可。
     */
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    /*
    返回类对象是否支持校验
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
