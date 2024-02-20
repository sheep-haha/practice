package com.zjh.practice.注入类;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 读取配置信息，将参数写入到类中，并将该类声明为一个Bean托管
 */
@SpringBootConfiguration
public class statementBean {

    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;
    @Value("${bucket}")
    private String bucket;
    @Value("${endPoint}")
    private String endPoint;

    @Bean
    public Aliyun aliyun(){
        return Aliyun.options()
                .setAppKey(appKey)
                .setAppSecret(appSecret)
                .setBucket(bucket)
                .setEndPoint(endPoint)
                .build();
    }



}
