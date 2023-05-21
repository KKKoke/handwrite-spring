package com.kkkoke.springframework.context.support;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.kkkoke.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinition(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinition(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}