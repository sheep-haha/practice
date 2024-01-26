package com.zjh.practice.StreamAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 简单使用Java 8 的Stream流
 */
public class InitStudent {
    /**
     * 初始化数据
     * @return 学生信息
     */
    public static List<StudentEntity> initData(){
        List<StudentEntity> StudentEntitys= new ArrayList<>();
        StudentEntity s1=new StudentEntity();
        s1.setName("王五");
        s1.setSchoolClass("一年级");
        s1.setChineseScore(100);
        s1.setMathScore(100);
        StudentEntitys.add(s1);

        StudentEntity s2=new StudentEntity();
        s2.setName("李四");
        s2.setSchoolClass("一年级");
        s2.setChineseScore(100);
        s2.setMathScore(100);
        StudentEntitys.add(s2);

        StudentEntity s3=new StudentEntity();
        s3.setName("李思");
        s3.setSchoolClass("二年级");
        s3.setChineseScore(100);
        s3.setMathScore(100);
        StudentEntitys.add(s3);

        StudentEntity s4=new StudentEntity();
        s4.setName("王五");
        s4.setSchoolClass("一年级");
        s4.setChineseScore(100);
        s4.setMathScore(100);
        StudentEntitys.add(s4);

        StudentEntity s5=new StudentEntity();
        s5.setName("赵三");
        s5.setSchoolClass("一年级");
        s5.setChineseScore(100);
        s5.setMathScore(100);
        StudentEntitys.add(s5);
        return StudentEntitys;
    }


}
