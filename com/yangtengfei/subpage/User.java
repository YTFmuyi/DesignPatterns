package com.yangtengfei.subpage;

public class User {
    String name;
    int age;
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
