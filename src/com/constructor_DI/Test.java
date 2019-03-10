package com.constructor_DI;

import com.constructor_DI.pojo.Edit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("com/constructor_DI/spring-config.xml");
        Edit ed=appContext.getBean("edit",Edit.class);
        ed.check();
    }
}
