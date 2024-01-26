package com.zjh.practice.接口函数.case1;

public interface Consumer {

    default void setNum(int num){};

    default void getNum(){};

}
