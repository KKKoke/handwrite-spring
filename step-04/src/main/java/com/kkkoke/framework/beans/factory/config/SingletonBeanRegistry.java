package com.kkkoke.framework.beans.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/08
 * @desc 单例 Bean 注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}