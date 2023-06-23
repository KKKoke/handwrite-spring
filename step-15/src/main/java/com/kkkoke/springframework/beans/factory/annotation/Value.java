package com.kkkoke.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author KeyCheung
 * @date 2023/06/18
 * @desc
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    String value();
}