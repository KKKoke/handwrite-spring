package com.kkkoke.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KeyCheung
 * @date 2023/05/08
 */
public class User {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("1111", "kkkoke");
        map.put("2222", "keycheung");
    }

    public String getUsername(String userId) {
        return map.get(userId);
    }
}