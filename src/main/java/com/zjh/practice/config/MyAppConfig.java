package com.zjh.practice.config;

import com.zjh.practice.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("读取配置类");
        HandlerInterceptor handlerInterceptor = new LoginInterceptor();

        //设置拦截地址,拦截localhost:9999/user/**
        String[] path = {"/secure/**"};
        //设置不拦截的地址 不拦截localhost:9999/user/login
        String[] excludepath = {"/jwt/login"};

        //拦截器注册类提供的方法
        registry.addInterceptor(handlerInterceptor).addPathPatterns(path).excludePathPatterns(excludepath);

    }



}
