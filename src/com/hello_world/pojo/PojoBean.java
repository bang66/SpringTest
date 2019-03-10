package com.hello_world.pojo;

public class PojoBean {
    private String name;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public void outPut(){
        System.out.println("您好，我叫"+this.name+"今年"+this.age+"岁！");
    }
    public void init(){
        System.out.println("init-----");
    }

    public void destroy(){
        System.out.println("destroy-----");
    }
}
