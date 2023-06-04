package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}