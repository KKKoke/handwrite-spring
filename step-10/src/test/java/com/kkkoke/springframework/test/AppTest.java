package com.kkkoke.springframework.test;

import com.kkkoke.springframework.context.support.ClassPathXmlApplicationContext;
import com.kkkoke.springframework.test.event.CustomEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testEvent() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1231234324234L, "成功了"));

        applicationContext.registerShutdownHook();
    }
}