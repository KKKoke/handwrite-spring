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

    public void testXml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println(result);
    }

    public void testHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("close!")));
    }
}