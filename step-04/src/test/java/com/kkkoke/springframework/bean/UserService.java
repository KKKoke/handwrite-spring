package com.kkkoke.springframework.bean;

/**
 * @author KeyCheung
 * @date 2023/05/08
 */
public class UserService {

    private String userId;

    private User user;

    public void getUserInfo() {
        System.out.println("查询用户信息: " + user.getUsername(userId));
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}