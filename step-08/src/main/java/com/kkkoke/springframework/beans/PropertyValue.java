package com.kkkoke.springframework.beans;

/**
 * @author KeyCheung
 * @date 2023/05/12
 * @desc Bean 的属性信息
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}