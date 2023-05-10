package com.kkkoke.framework.beans.factory.support;

import com.kkkoke.framework.beans.factory.config.BeanDefinition;

/**
 * @author KeyCheung
 * @date 2023/05/08
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}