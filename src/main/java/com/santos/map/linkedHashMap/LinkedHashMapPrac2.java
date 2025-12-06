package com.santos.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPrac2 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"hello");
        map.put(2,"hello2");
        map.put(3,"hello3");
        map.put(4,"hello4");
        map.put(5,"hello5");
        map.put(6,"hello6");
        map.put(7,"hello7");
        map.get(5);
        map.entrySet().stream().forEach((item)->{
            System.out.println("Key=" + item.getKey() + " " + "value=" + item.getValue());
        });
    }
}
