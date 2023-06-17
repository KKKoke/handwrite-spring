package com.kkkoke.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author KeyCheung
 * @date 2023/06/17
 * @desc
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}