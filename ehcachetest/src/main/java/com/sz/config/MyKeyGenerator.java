package com.sz.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class MyKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object o, Method method, Object... objects) {
        //根据请求参数中的当前对象、当前请求的方法以及方法的参数  生成一个新的key返回，返回值就是缓存的key



        return Arrays.toString(objects);
    }
}
