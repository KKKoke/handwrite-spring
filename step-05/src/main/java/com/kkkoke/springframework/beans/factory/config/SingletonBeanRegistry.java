package com.kkkoke.springframework.beans.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/10
 * @desc 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}