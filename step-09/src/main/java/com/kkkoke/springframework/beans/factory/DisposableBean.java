package com.kkkoke.springframework.beans.factory;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public interface DisposableBean {

    void destroy() throws Exception;
}