package com.kkkoke.springframework.test.converter;

import com.kkkoke.springframework.core.convert.converter.Converter;

/**
 * @author KeyCheung
 * @date 2023/06/27
 * @desc
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}