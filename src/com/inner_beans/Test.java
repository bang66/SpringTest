package com.inner_beans;

import com.inner_beans.pojo.Edit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("com/inner_beans/spring-config.xml");
        Edit ed=app.getBean("ed" ,Edit.class);
        ed.check();
    }


}
