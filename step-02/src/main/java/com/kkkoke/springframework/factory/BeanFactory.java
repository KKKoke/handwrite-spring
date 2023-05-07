package com.kkkoke.springframework.factory;

import com.kkkoke.springframework.factory.exception.BeansException;

/**
 * @author KeyCheung
 * @date 2023/15/29
 * @desc Bean 工厂接口
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}