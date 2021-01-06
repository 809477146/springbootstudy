package com.sz.service;

import com.sz.entity.User;
import com.sz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 1.定义 UserService 实现 UserDetailsService 接口，并实现该接口中的 loadUserByUsername 方法，
 * 该方法的参数就是用户登录时输入的用户名，通过用户名去数据库中查找用户，如果没有查 找到用户，
 * 就抛出一个账户不存在的异常，如果查找到了用户，就继续查找该用户所具有的 角色信息，并将获取到的 user 对象返回，
 * 再由系统提供的 DaoAuthenticationProvider 类去比对密码是否正确。
 * 2.loadUserByUsername 方法将在用户登录时自动调用
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("账户不存在！");
        }
        user.setRoles(userMapper.getUserRolesByUid(user.getId()));
        return user;
    }
}
