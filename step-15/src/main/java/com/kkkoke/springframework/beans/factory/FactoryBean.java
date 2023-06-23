package com.kkkoke.springframework.beans.factory;

/**
 * @author KeyCheung
 * @date 2023/05/27
 * @desc
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}