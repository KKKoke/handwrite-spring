package com.kkkoke.springframework.aop;

/**
 * @author KeyCheung
 * @date 2023/06/03
 * @desc
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Class<?>[] getTargetClass() {
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget(){
        return this.target;
    }
}