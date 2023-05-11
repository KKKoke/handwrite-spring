package com.kkkoke.springframework.beans.factory;

import com.kkkoke.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author KeyCheung
 * @date 2023/05/11
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的 Bean 名称
     */
    String[] getBeanDefinitionNames();
}