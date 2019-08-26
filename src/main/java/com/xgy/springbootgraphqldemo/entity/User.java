package com.xgy.springbootgraphqldemo.entity;

import org.springframework.lang.UsesSunMisc;

public class User {
    private Integer id;
    private int age;;
    private String username;
    private String password;

    public User(){}

    public User(Integer id,String username,String password,int age){
        this.age=age;
        this.username= username;
        this.password=password;
        this.id=id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
