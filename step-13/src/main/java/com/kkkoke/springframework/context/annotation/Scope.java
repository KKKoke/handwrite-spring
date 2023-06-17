package com.kkkoke.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author KeyCheung
 * @date 2023/06/17
 * @desc
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}