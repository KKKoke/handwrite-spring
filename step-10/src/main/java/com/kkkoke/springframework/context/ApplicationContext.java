package com.kkkoke.springframework.context;

import com.kkkoke.springframework.beans.factory.HierarchicalBeanFactory;
import com.kkkoke.springframework.beans.factory.ListableBeanFactory;
import com.kkkoke.springframework.core.io.ResourceLoader;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}