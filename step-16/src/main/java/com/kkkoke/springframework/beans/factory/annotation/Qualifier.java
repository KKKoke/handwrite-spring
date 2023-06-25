package com.kkkoke.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author KeyCheung
 * @date 2023/06/18
 * @desc
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";
}