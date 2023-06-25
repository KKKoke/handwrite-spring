package com.kkkoke.springframework.aop;

/**
 * @author KeyCheung
 * @date 2023/06/03
 * @desc
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}