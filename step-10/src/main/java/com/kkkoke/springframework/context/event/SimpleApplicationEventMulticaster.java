package com.kkkoke.springframework.context.event;

import com.kkkoke.springframework.beans.factory.BeanFactory;
import com.kkkoke.springframework.context.ApplicationEvent;
import com.kkkoke.springframework.context.ApplicationListener;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}