package com.zjh.practice.注入类;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 获取Bean并使用
 */
@Service
public class userBean {
    @Autowired
    private Aliyun aliyun;

    public void printStr(){
        System.out.println(aliyun.getAppKey());
        System.out.println(aliyun.getBucket());
        System.out.println(aliyun.getAppSecret());
        System.out.println(aliyun.getAppSecret());
    }


}
