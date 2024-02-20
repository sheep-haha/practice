package com.zjh.practice.注入类;

public class test {
    public static void main(String[] args) {
        // 这种写法无法修改设置的参数
        Aliyun aliyunInstance = Aliyun.options()
                .setAppKey("yourAppKey")
                .setAppSecret("yourAppSecret")
                .setBucket("yourBucket")
                .setEndPoint("yourEndPoint")
                .build();

        // 可以修改参数的写法
        Aliyun.Builder builder = Aliyun.options()
                .setAppKey("yourAppKey")
                .setAppSecret("yourAppSecret")
                .setBucket("yourBucket")
                .setEndPoint("yourEndPoint");

        Aliyun aliyunInstance2 = builder.setAppKey("myAppKey").build();
        System.out.println(aliyunInstance2.toString());
    }
}
