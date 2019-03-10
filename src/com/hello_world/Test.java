package com.hello_world;

import com.hello_world.pojo.IntroduceDemo;
import com.hello_world.pojo.PojoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        创建一个Spring的IOC容器对象   创建应用程序的上下文      该ClassPathXmlApplicationContext容器会从 CLASSPATH 中搜索 bean 配置文件。
        ApplicationContext app=new ClassPathXmlApplicationContext("com/hello_world/applicationContext.xml");

        System.out.println("-------------");
        //从IOC容器中获取Bean实例
        IntroduceDemo id=app.getBean("po1",IntroduceDemo.class);
        id.introduce();
        PojoBean po=app.getBean("pojo1",PojoBean.class);
        po.setAge(11);
        po.setName("xxx");
        //销毁bean
        ((ClassPathXmlApplicationContext) app).registerShutdownHook();

    }
}
