package com.kkkoke.springframework.core.io;

/**
 * @author KeyCheung
 * @date 2023/05/10
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}