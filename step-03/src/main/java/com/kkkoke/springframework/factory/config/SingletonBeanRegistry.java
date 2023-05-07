package com.kkkoke.springframework.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc 单例 Bean 注册接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}