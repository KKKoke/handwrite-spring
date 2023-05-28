package com.kkkoke.springframework.test.bean;

import com.kkkoke.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KeyCheung
 * @date 2023/05/28
 * @desc
 */
public class ProxyBeanFactory implements FactoryBean<IUserDao> {

    @Override
    public IUserDao getObject() throws Exception {
        InvocationHandler handler = ((proxy, method, args) -> {

            // 添加排除方法
            if ("toString".equals(method.getName())) {
                return this.toString();
            }

            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("10001", "kkkoke");
            hashMap.put("10002", "keycheung");

            return "你被代理了 " + method.getName() + ": " + hashMap.get(args[0].toString());
        });
        return (IUserDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}