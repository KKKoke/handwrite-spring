package com.kkkoke.springframework;

import com.kkkoke.springframework.bean.User;
import com.kkkoke.springframework.factory.config.BeanDefinition;
import com.kkkoke.springframework.factory.support.DefaultListableBeanFactory;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        defaultListableBeanFactory.registerBeanDefinition("user", beanDefinition);
        User user1 = (User) defaultListableBeanFactory.getBean("user");
        user1.getUserName();
        // 第二次从单例缓存中获取 Bean 对象
        User user2 = (User) defaultListableBeanFactory.getBean("user");
        user2.getUserName();
        System.out.println(user1 == user2);
    }
}