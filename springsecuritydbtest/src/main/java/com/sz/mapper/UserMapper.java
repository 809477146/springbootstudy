package com.sz.mapper;

import com.sz.entity.Role;
import com.sz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    User loadUserByUsername(String username);

    @Select("select r.* from role r,user_role ur where r.id=ur.rid and ur.uid=#{id}")
    List<Role> getUserRolesByUid(Integer id);

}
