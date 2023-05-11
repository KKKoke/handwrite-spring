package com.kkkoke.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "kkkoke");
        hashMap.put("10002", "keycheung");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}