package com.aop_after_returning_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 切面类
// 该类作为Spring的组件使用的所以必须加@Component

@Aspect
@Component
public class MyAspect {


//    定义切入点表达式
    @Pointcut("execution(* com.aop_after_returning_annotation.*.*(..))")
    //使用一个返回值为void,方法体为空的方法来命名切入点
    private void myPointCut(){}




//    定义后置通知
    @AfterReturning("myPointCut()")
    public void myAfterRetuxrning(JoinPoint joinPoint) throws Throwable {
        System.out.println("*************后置通知*************");
        System.out.println("*目标类: "+joinPoint.getTarget());
        System.out.println("*目标方法: "+joinPoint.getSignature().getName());
        System.out.println("*************后置通知*************");
    }
}
