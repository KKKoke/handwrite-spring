package com.kkkoke.springframework.beans.factory.support;

import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author KeyCheung
 * @date 2023/05/07
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        return beanDefinitionMap.get(beanName);
    }
}