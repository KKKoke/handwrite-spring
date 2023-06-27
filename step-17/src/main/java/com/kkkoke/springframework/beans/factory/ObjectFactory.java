package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/06/23
 * @desc
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}