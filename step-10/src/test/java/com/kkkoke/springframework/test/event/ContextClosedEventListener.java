package com.kkkoke.springframework.test.event;

import com.kkkoke.springframework.context.ApplicationListener;
import com.kkkoke.springframework.context.event.ContextClosedEvent;

/**
 * @author KeyCheung
 * @date 2023/05/31
 * @desc
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }
}