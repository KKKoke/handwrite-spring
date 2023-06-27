package com.kkkoke.springframework.core.convert;

import org.jetbrains.annotations.Nullable;

/**
 * @author KeyCheung
 * @date 2023/06/26
 * @desc 类型转换抽象接口
 */
public interface ConversionService {

    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetType);
}