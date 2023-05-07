package com.kkkoke.springframework.bean;

/**
 * @author KeyCheung
 * @date 2023/05/07
 */
public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getUserName() {
        return name;
    }
}