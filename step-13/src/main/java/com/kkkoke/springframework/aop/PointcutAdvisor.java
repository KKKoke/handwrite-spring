package com.kkkoke.springframework.aop;

/**
 * @author KeyCheung
 * @date 2023/06/11
 * @desc
 */
public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}