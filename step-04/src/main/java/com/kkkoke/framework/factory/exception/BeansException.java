package com.kkkoke.framework.factory.exception;

/**
 * @author KeyCheung
 * @date 2023/05/08
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}