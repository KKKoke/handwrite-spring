package com.kkkoke.springframework;

import com.kkkoke.springframework.bean.User;
import com.kkkoke.springframework.factory.config.BeanDefinition;
import com.kkkoke.springframework.factory.support.DefaultListableBeanFactory;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        defaultListableBeanFactory.registerBeanDefinition("user", beanDefinition);
        User user = (User) defaultListableBeanFactory.getBean("user", "kkkoke");
        System.out.println(user.getUserName());
    }
}