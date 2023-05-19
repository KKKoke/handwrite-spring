package com.kkkoke.springframework.beans.factory.config;

import com.kkkoke.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/17
 * @desc
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableBeanFactory beanFactory) throws BeansException;
}