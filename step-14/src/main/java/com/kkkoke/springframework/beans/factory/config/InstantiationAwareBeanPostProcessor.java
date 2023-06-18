package com.kkkoke.springframework.beans.factory.config;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.PropertyValues;

/**
 * @author KeyCheung
 * @date 2023/06/11
 * @desc
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    /**
     * 在 Bean 对象实例化完成后，设置属性操作之前执行此方法
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;
}