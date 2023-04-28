package com.kkkoke.springframework;

/**
 * @author KeyCheung
 * @date 2023/04/28
 * @desc Bean 定义信息
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
