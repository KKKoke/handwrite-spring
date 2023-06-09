package com.kkkoke.framework.beans.factory.support;

import com.kkkoke.framework.beans.factory.config.BeanDefinition;
import com.kkkoke.framework.beans.BeansException;

import java.lang.reflect.Constructor;

/**
 * @author KeyCheung
 * @date 2023/05/08
 * @desc Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}