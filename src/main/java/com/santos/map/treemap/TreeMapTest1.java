package com.santos.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest1 {
    public static void main(String[] args) {
//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("Apple", 1);
//        treeMap.put("Banana", 2);
//        treeMap.put("Cherry", 3);
//
//        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("Apple", 1);
//        treeMap.put("Banana", 2);
//        treeMap.put("Cherry", 3);
//
//        for (String key : treeMap.keySet()) {
//            System.out.println(key + ": " + treeMap.get(key));
//        }

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);

        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }


    }
}
