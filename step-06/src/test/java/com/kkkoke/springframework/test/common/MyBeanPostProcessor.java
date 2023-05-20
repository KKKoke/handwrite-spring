package com.kkkoke.springframework.test.common;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.factory.config.BeanPostProcessor;
import com.kkkoke.springframework.test.bean.UserService;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}