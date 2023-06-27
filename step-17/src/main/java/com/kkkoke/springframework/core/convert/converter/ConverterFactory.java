package com.kkkoke.springframework.core.convert.converter;

/**
 * @author KeyCheung
 * @date 2023/06/26
 * @desc
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}