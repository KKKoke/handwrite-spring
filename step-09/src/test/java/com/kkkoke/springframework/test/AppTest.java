package com.kkkoke.springframework.test;

import com.kkkoke.springframework.context.support.ClassPathXmlApplicationContext;
import com.kkkoke.springframework.test.bean.UserService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testProtoType() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService01 = applicationContext.getBean("userService", UserService.class);
        UserService userService02 = applicationContext.getBean("userService", UserService.class);

        // 配置 scope="prototype/singleton"
        System.out.println(userService01);
        System.out.println(userService02);

        System.out.println(userService01 + " 十六进制哈希：" + Integer.toHexString(userService01.hashCode()));
    }

    public void testFactoryBean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 调用代理方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.queryUserInfo());
    }
}