package com.kkkoke.springframework.aop.aspectj;

import com.kkkoke.springframework.aop.Pointcut;
import com.kkkoke.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @author KeyCheung
 * @date 2023/06/11
 * @desc
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;

    // 具体的拦截方法
    private Advice advice;

    // 表达式
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public Pointcut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}