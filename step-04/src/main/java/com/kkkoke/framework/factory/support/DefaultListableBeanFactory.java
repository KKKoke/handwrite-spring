package com.kkkoke.framework.factory.support;

import com.kkkoke.framework.factory.config.BeanDefinition;
import com.kkkoke.framework.factory.exception.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author KeyCheung
 * @date 2023/05/08
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }
}