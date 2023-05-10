package com.kkkoke.springframework.beans;

/**
 * @author KeyCheung
 * @date 2023/4/29
 * @desc Bean 异常
 */
public class BeansException extends RuntimeException {

    public BeansException() {
    }

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}