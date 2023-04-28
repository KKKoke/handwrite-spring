package com.kkkoke.springframework;

import com.kkkoke.springframework.bean.Student;
import org.junit.Test;

/**
 * @author KeyCheung
 * @date 2023/04/28
 * @desc 测试类
 */
public class GetBeanTest {

    @Test
    public void getBeanTest() {
        BeanDefinition beanDefinition = new BeanDefinition(new Student("kkkoke", 21));
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("studentBean", beanDefinition);
        Object studentBean = beanFactory.getBean("studentBean");
        System.out.println(studentBean);
    }
}
