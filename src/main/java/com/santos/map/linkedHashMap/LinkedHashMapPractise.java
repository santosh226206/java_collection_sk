package com.santos.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractise {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("hello",1);
        map.put("hi",2);
        map.put("how",1);
        map.put("are",2);
        map.put("you",1);
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }
        //System.out.println(map.entr);
    }
}
