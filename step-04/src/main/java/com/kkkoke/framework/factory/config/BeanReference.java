package com.kkkoke.framework.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/08
 * @desc Bean 的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}