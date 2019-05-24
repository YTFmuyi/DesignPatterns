package com.yangtengfei;

import com.yangtengfei.subpage.User;

public class UseSubClass {
    public static void main(String[] args) {
        User user = new User("Bob",21);
        System.out.println(user.getName()+','+user.getAge());
    }
}
