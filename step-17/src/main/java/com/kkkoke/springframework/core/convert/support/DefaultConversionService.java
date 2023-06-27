package com.kkkoke.springframework.core.convert.support;

import com.kkkoke.springframework.core.convert.converter.ConverterRegistry;

/**
 * @author KeyCheung
 * @date 2023/06/26
 * @desc
 */
public class DefaultConversionService extends GenericConversionService {

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}