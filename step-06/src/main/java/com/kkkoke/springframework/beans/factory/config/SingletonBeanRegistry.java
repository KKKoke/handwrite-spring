package com.kkkoke.springframework.beans.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/17
 * @desc
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}