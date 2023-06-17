package com.kkkoke.springframework.context.event;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}