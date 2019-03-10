package com.aop_after_returning_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAspectj {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/aop_after_returning_annotation/applicationContext.xml");
        UserDao userDao= (UserDao) appContext.getBean("userDao");
        userDao.add();
        System.out.println("========================分界线========================");
        userDao.del();
    }
}
