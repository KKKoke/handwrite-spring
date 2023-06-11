package com.kkkoke.springframework.test.bean;

import com.kkkoke.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author KeyCheung
 * @date 2023/06/11
 * @desc
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}