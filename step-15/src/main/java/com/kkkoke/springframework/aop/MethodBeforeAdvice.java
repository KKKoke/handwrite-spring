package com.kkkoke.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author KeyCheung
 * @date 2023/06/11
 * @desc
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}