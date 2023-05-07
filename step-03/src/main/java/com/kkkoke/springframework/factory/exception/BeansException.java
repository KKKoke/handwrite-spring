package com.kkkoke.springframework.factory.exception;

/**
 * @author KeyCheung
 * @date 2023/05/07
 * @desc Bean 自定义异常
 */
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}