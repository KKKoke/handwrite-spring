package com.kkkoke.springframework.test.bean;

/**
 * @author KeyCheung
 * @date 2023/06/23
 * @desc
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}