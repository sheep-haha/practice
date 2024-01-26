package com.zjh.practice.StreamAPI;


import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {
    /**
     * 找出所有学生的姓名
     */
    public static void findAllStudentCommon(){
        List<String> listName = new ArrayList<>();
        List<StudentEntity> studentEntities = InitStudent.initData();
        for (StudentEntity studentEntity : studentEntities) {
            String name = studentEntity.getName();
            listName.add(name);
        }
        System.out.println("普通遍历方式：" + JSONObject.toJSONString(listName));
    }

    public static void findAllStudentStream(){
        List<StudentEntity> studentEntities = InitStudent.initData();

        List<String> listName = studentEntities.stream().map(StudentEntity::getName).collect(Collectors.toList());
        listName.forEach( e-> System.out.println("Stream方式："+ e));

        listName.forEach( (e)-> {
            System.out.println("Stream方式：" + e);
            // 多条操作
        }
        );
        studentEntities.stream().map(StudentEntity::getName).forEach(System.out::println);

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
    }


    public static void main(String[] args) {
        List<StudentEntity> studentEntities = InitStudent.initData();
        long count = studentEntities.stream().distinct().count();
        System.out.println(count);
    }
}


