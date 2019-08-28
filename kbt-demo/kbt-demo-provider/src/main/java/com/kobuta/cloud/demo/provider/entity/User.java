package com.kobuta.cloud.demo.provider.entity;

import lombok.Data;

@Data
public class User {

    private int id;

    private String userName;

    private int age;

    public User() {

    }

    public User(int id, String name, int age ) {
        setId(id);
        setAge(age);
        setUserName(name);
    }

}
