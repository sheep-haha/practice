package com.zjh.practice.接口函数.case1;

public abstract class conn {
    public static void main(String[] args) {
        Consumer consumer = new Consumer() {
            @Override
            public void setNum(int num) {
                System.out.println("num = " + num);
            }

            @Override
            public void getNum() {
                System.out.println();
            }
        };

    }
}
