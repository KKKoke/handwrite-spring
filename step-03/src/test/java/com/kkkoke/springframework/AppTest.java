package com.kkkoke.springframework;

import com.kkkoke.springframework.bean.User;
import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.factory.support.DefaultListableBeanFactory;
import junit.framework.TestCase;

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