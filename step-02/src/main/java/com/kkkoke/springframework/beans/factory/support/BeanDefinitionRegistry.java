package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.factory.config.BeanDefinition;

/**
 * @author KeyCheung
 * @date 2023/4/29
 * @desc Bean 定义信息注册接口
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}