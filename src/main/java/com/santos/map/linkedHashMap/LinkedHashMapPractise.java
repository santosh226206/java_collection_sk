package com.santos.map.linkedHashMap;

import java.util.Iterator;
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
//        for(Map.Entry<String,Integer> item: map.entrySet()){
//            System.out.println(item.getKey() + " " + item.getValue());
//        }
//        for (String key : map.keySet()) {
//            System.out.println("Key: " + key + ", Value: " + map.get(key));
//        }
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

    }

    //Iterable<Map.Entry<String,Integer>> itr=new Iterator<>();
        //System.out.println(map.entr);

}
