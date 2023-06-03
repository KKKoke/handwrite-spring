package com.kkkoke.springframework.test.event;

import com.kkkoke.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author KeyCheung
 * @date 2023/05/31
 * @desc
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息；时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}