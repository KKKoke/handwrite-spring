package com.kkkoke.springframework.core.convert.converter;

/**
 * @author KeyCheung
 * @date 2023/06/26
 * @desc
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverter(GenericConverter converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);
}