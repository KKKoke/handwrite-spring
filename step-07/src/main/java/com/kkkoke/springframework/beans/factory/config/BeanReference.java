package com.kkkoke.springframework.beans.factory.config;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
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