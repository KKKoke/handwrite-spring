package com.kkkoke.springframework.beans.factory;

/**
 * @author KeyCheung
 * @date 2023/05/10
 * @desc bean 属性信息
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