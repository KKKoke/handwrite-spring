package com.kkkoke.springframework.test;

import com.kkkoke.springframework.context.support.ClassPathXmlApplicationContext;
import com.kkkoke.springframework.test.bean.UserService;
import junit.framework.TestCase;

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

        System.out.println("ApplicationContextAware: " + userService.getApplicationContext());
        System.out.println("BeanFactoryAware: " + userService.getBeanFactory());
    }
}