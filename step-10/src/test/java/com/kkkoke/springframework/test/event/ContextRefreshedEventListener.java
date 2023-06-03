package com.kkkoke.springframework.test.event;

import com.kkkoke.springframework.context.ApplicationListener;
import com.kkkoke.springframework.context.event.ContextRefreshedEvent;

/**
 * @author KeyCheung
 * @date 2023/05/31
 * @desc
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }
}