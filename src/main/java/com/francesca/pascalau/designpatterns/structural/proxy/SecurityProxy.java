package com.francesca.pascalau.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.reflect.Proxy.newProxyInstance;

public class SecurityProxy implements InvocationHandler {

    private Object object;

    public SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new SecurityProxy(object)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = new Object();
        try {
            result = method.invoke(object, args);
        } catch (InvocationTargetException e) {
            e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception " + e.getMessage());
        }
        return result;
    }
}
