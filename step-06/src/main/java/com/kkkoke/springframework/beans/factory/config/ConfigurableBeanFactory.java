package com.kkkoke.springframework.beans.factory.config;

import com.kkkoke.springframework.beans.factory.HierarchicalBeanFactory;
import com.kkkoke.springframework.beans.factory.config.BeanPostProcessor;
import com.kkkoke.springframework.beans.factory.config.SingletonBeanRegistry;

/**
 * @author KeyCheung
 * @date 2023/05/17
 * @desc
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}