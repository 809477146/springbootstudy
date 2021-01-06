package com.sz.mapper;

import com.sz.entity.Menu;
import com.sz.entity.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {

    @Select("select m.*,r.id as rid,r.name as rname,r.nameZh as rnameZh from menu m " +
            "left join menu_role mr on m.id=mr.mid left join role r on mr.rid=r.id")
    @Results(value = {
//            @Result(column = "rid",property = "id",jdbcType = JdbcType.INTEGER,javaType = Role.class),
//            @Result(column = "rname",property = "name",jdbcType = JdbcType.VARCHAR,javaType = Role.class),
            @Result(property = "roles",column = "rid",javaType = List.class,
            many = @Many(select = "com.sz.mapper.MenuMapper.getRoleById"))
    })
    List<Menu> getAllMenus();

    @Select("select * from role where id=#{id}")
    List<Role> getRoleById(Integer id);
}
