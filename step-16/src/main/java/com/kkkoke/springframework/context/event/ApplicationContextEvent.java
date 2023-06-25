package com.kkkoke.springframework.context.event;

import com.kkkoke.springframework.context.ApplicationContext;
import com.kkkoke.springframework.context.ApplicationEvent;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}