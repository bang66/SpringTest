package com.setter_DI;

import com.setter_DI.pojo.Edit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("com/setter_DI/spring-config.xml");
        Edit ed=app.getBean("ed" ,Edit.class);
        ed.check();
    }


}
