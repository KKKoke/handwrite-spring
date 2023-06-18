package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.core.io.Resource;
import com.kkkoke.springframework.core.io.ResourceLoader;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}