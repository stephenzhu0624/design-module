package com.example.demo.module.proxy;

import org.springframework.aop.ProxyMethodInvocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInstance implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
