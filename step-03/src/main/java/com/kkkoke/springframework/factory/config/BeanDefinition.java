package com.kkkoke.springframework.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc Bean 定义信息
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}