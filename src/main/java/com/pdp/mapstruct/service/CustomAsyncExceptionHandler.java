package com.pdp.mapstruct.service;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

public class CustomAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        System.out.println("Exception occurred in async method: " + method.getName());
        System.out.println("Exception message: " + throwable.getMessage());
        for (Object param : objects) {
            System.out.println("Parameter value: " + param);
        }
    }
}
