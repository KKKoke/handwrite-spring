package com.kkkoke.springframework.context;

import java.util.EventObject;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public abstract class ApplicationEvent extends EventObject {

    public ApplicationEvent(Object source) {
        super(source);
    }
}