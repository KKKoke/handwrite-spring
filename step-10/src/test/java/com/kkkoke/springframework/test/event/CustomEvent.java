package com.kkkoke.springframework.test.event;

import com.kkkoke.springframework.context.event.ApplicationContextEvent;

/**
 * @author KeyCheung
 * @date 2023/05/31
 * @desc
 */
public class CustomEvent extends ApplicationContextEvent {

    private Long id;

    private String message;

    public CustomEvent(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}