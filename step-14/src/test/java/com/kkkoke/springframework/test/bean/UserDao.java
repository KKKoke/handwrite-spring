package com.kkkoke.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KeyCheung
 * @date 2023/06/18
 * @desc
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("20020104", "kkkoke，浙江，杭州");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}