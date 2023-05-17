package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/11
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object[] args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}