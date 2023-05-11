package com.kkkoke.springframework.beans;

/**
 * @author KeyCheung
 * @date 2023/05/10
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}