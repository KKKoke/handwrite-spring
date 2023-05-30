package com.kkkoke.springframework.context.support;

import com.kkkoke.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.kkkoke.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinition(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}