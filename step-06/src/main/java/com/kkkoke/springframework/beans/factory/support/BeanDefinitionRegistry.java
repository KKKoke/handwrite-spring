package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.factory.config.BeanDefinition;

/**
 * @author KeyCheung
 * @date 2023/05/17
 * @desc
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}