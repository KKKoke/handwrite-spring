package com.kkkoke.springframework.context;

import com.kkkoke.springframework.beans.BeansException;
import com.kkkoke.springframework.beans.factory.Aware;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}