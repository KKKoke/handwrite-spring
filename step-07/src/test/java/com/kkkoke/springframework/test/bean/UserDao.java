package com.kkkoke.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("12345", "kkkoke");
        hashMap.put("12346", "keycheung");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}