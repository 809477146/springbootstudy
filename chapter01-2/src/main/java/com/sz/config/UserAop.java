package com.sz.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAop {
    @Pointcut("execution(* com.sz.Service.*.*(..))")
    public void pc(){
    }

    @Before(value = "pc()")
    public void beforeAdvice(JoinPoint point){
        String name = point.getSignature().getName();
        System.out.println(name+"方法启动。。。。");
    }

    @After(value="pc()")
    public void afterAdvice(JoinPoint point){
        String name = point.getSignature().getName();
        System.out.println(name+"方法结束。。。。");
    }

    @AfterReturning(value = "pc()",returning = "result")
    public void afterReturningAdvice(JoinPoint point,Object result){
        String name = point.getSignature().getName();
        System.out.println(name+"方法结束，返回参数:"+result);
    }

    @AfterThrowing(value = "pc()",throwing = "e")
    public void afterThrowingAdvice(JoinPoint point,Exception e){
        String name = point.getSignature().getName();
        System.out.println(name+"方法出现异常，异常信息:"+e.getMessage());
    }

    @Around(value = "pc()")
    public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
        return point.proceed();
    }





}
