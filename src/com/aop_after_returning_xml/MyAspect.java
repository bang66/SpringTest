package com.aop_after_returning_xml;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void myAfterRetuxrning(JoinPoint joinPoint) throws Throwable {
        System.out.println("*************后置通知*************");
        System.out.println("*目标类: "+joinPoint.getTarget());
        System.out.println("*目标方法: "+joinPoint.getSignature().getName());
        System.out.println("*************后置通知*************");
    }
}
