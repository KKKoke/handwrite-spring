package com.kkkoke.springframework.factory.support;

import com.kkkoke.springframework.factory.BeanFactory;
import com.kkkoke.springframework.factory.config.BeanDefinition;
import com.kkkoke.springframework.factory.exception.BeansException;
import com.sun.jdi.ObjectReference;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc Bean 工厂抽象实现类
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}