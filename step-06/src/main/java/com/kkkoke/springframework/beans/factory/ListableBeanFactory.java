package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author KeyCheung
 * @date 2023/05/19
 * @desc
 */
public interface ListableBeanFactory extends BeanFactory {

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}