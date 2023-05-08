package com.kkkoke.framework.factory;

/**
 * @author KeyCheung
 * @date 2023/05/08
 * @desc Bean 属性信息
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