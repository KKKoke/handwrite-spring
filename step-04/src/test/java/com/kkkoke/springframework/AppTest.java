package com.kkkoke.springframework;

import com.kkkoke.framework.beans.factory.PropertyValue;
import com.kkkoke.framework.beans.factory.PropertyValues;
import com.kkkoke.framework.beans.factory.config.BeanDefinition;
import com.kkkoke.framework.beans.factory.config.BeanReference;
import com.kkkoke.framework.beans.factory.support.DefaultListableBeanFactory;
import com.kkkoke.springframework.bean.User;
import com.kkkoke.springframework.bean.UserService;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("user", new BeanDefinition(User.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userId", "1111"));
        propertyValues.addPropertyValue(new PropertyValue("user", new BeanReference("user")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.getUserInfo();
    }
}