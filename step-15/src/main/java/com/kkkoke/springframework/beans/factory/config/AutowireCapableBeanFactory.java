package com.kkkoke.springframework.beans.factory.config;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.factory.BeanFactory;

/**
 * @author KeyCheung
 * @date 2023/05/18
 * @desc
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}