package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.BeansException;

import java.lang.reflect.Constructor;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}