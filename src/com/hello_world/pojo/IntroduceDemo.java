package com.hello_world.pojo;

public class IntroduceDemo {
    private String name;
    private  int  age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduce(){
        System.out.println("您好，我叫"+this.name+"今年"+this.age+"岁！");
    }

}
