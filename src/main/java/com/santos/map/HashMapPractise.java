package com.santos.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractise {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        List<Map.Entry<Integer,String>> output=map.entrySet().stream().filter((item)->item.getKey() % 2 ==0).toList();
        System.out.println(output);
    }
}
