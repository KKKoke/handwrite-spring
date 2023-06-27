package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author KeyCheung
 * @date 2023/05/19
 * @desc
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}