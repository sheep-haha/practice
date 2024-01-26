package com.zjh.practice.collaction;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Description 针对集合api的一些细节
 */

public class demo {
    /**
     * 获取map数据的方式
     */
    @Test
    public void test_1() {
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
    }

    /**
     * map、list复制的方式
     */
    @Test
    public void test_2() {
        List<String> list = new ArrayList<>();
        list.add("张老大");
        list.add("张老二");
        list.add("张老三");
        list.add("李老大");
        list.add("王老大");

        // 1. 方式一：复制list数据到list2
        // List<String> list2 = new ArrayList<>(list);

        //     方式二：复制list数据到list2
        // 必须得确保list2与list长度一致
        List<String>  list2 = new ArrayList<>(Collections.nCopies(list.size(), null));
        Collections.copy(list2,list);
        System.out.println(JSONObject.toJSONString(list2));


        Map<String,String> map = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        map.put("name","翟佳豪");
        map.put("sex","男");
        map.put("age","18");
        map.put("address","西安");
        map2.putAll(map);   // 浅拷贝


        System.out.println(JSONObject.toJSONString(map2));

    }

    /**
     * 检验contanskeys方法
     */
    @Test
    public void test_3() {
        Map<String,String> map = new HashMap<>();
        map.put("xx","name");
        map.put("sex","男");
        map.put("age","18");
        map.put("address","西安");
        //System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("xx"));
        System.out.println();
    }

    @Test
    public void test_4() {
        Map<String,String> map = new HashMap<>();
        map.putIfAbsent("name","翟佳豪");
        map.putIfAbsent("sex","男");
        map.putIfAbsent("age","18");
        map.put("address", "北京");
        String s = map.putIfAbsent("address", "西安");

        System.out.println(s);


    }
}
