package com.sz.controller;

import com.sz.pojo.User;
import com.sz.validation.ValidationGroup2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 给 User参数添加＠Validated 注解，表示需要对该参数做校验，
 * 紧接着的BindingResult参数表示在校验出错时保存的出错信息。
 * @Validated 注解带参数则表示分组校验
 *
 * 如果 BindingResult中的hasErrors方法返回归1e，表示有错误信息，此时遍历错误信息，
 * 将之返回给前端。
 */
@RestController
public class UserController {

    @PostMapping(value = "/user",produces = "application/json; charset=utf-8")
    public List<String> addUser(@Validated(ValidationGroup2.class) User user, BindingResult result){
        List<String> errors = new ArrayList<>();
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for(ObjectError error : allErrors){
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }
}
