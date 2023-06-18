package com.kkkoke.springframework.beans.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}