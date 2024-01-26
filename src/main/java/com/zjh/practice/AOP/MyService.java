package com.zjh.practice.AOP;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Loggable
    public void msgShow(String name,int age) {
        System.out.println("打印具体数据");
    }

}
