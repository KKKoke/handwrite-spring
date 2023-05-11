package com.kkkoke.springframework.test;

import cn.hutool.core.io.IoUtil;
import com.kkkoke.springframework.beans.factory.PropertyValue;
import com.kkkoke.springframework.beans.factory.PropertyValues;
import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.beans.factory.config.BeanReference;
import com.kkkoke.springframework.beans.factory.supprt.DefaultListableBeanFactory;
import com.kkkoke.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.kkkoke.springframework.core.io.DefaultResourceLoader;
import com.kkkoke.springframework.core.io.Resource;
import com.kkkoke.springframework.test.bean.UserDao;
import com.kkkoke.springframework.test.bean.UserService;
import junit.framework.TestCase;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author KeyCheung
 * @date 2023/05/11
 */
public class ApiTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        String result = userService.queryUserInfo();
        System.out.println(result);
    }

    private DefaultResourceLoader resourceLoader;

    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    public void testClassPath() throws IOException {
        init();
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    public void testFile() throws IOException {
        init();
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    public void testXml() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println(result);
    }
}