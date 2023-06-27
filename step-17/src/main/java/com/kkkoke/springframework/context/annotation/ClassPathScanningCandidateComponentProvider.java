package com.kkkoke.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import com.kkkoke.springframework.beans.factory.config.BeanDefinition;
import com.kkkoke.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author KeyCheung
 * @date 2023/06/17
 * @desc
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}