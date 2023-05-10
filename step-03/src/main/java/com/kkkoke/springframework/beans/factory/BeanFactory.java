package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc Bean 工厂接口
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}