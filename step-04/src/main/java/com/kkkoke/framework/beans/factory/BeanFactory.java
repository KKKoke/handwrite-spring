package com.kkkoke.framework.beans.factory;

import com.kkkoke.framework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/08
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}