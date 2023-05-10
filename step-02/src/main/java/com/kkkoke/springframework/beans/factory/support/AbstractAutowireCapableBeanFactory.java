package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/4/29
 * @desc 抽象自动自动装配 Bean 工厂
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}