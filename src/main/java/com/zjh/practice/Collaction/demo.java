package com.zjh.practice.Collaction;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张老大");
        list.add("张老二");
        list.add("张老三");
        list.add("李老大");
        list.add("王老大");

        Map<String,String> map = new HashMap<>();
        map.put("name","翟佳豪");
        map.put("sex","男");
        map.put("age","18");
        map.put("address","西安");

        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("--------------------");
        }

        System.out.println("map.keySet()："+ JSONObject.toJSONString(keys));
        System.out.println("map.values()："+ JSONObject.toJSONString(values));
        System.out.println("map.entrySet()："+ JSONObject.toJSONString(entries));
        System.out.println("map："+ JSONObject.toJSONString(map));

//        Class<student> studentClass = student.class;
//        student student = studentClass.newInstance();

        student s = new student();

    }
}
