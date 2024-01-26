package com.zjh.practice.函数式接口;

public class Son extends Father {

    @Override
    public void show1() {
        System.out.println("show1");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.show2();
    }

}
