package com.kkkoke.springframework.test.common;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.PropertyValue;
import com.kkkoke.springframework.beans.PropertyValues;
import com.kkkoke.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}