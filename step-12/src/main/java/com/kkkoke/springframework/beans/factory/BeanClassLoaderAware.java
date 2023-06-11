package com.kkkoke.springframework.beans.factory;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}