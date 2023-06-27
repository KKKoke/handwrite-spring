package com.kkkoke.springframework.core.convert.converter;

/**
 * @author KeyCheung
 * @date 2023/06/26
 * @desc
 */
public interface Converter<S, T> {

    T convert(S source);
}