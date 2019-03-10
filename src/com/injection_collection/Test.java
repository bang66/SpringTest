package com.injection_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //集合中注入普通值
        ApplicationContext context = new ClassPathXmlApplicationContext("com/injection_collection/Beans1.xml");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
