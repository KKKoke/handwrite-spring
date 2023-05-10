package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.BeansException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc 实例化策略简单实现类
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if (ctor != null) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}