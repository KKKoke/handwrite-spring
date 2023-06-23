package com.kkkoke.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author KeyCheung
 * @date 2023/06/03
 * @desc
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}