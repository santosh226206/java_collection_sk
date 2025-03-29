package com.santos.hashset.src.stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10,15,8,49,25,98,98,32,15};

        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("repeating characters------------");
        Set<Integer> set=new HashSet<>();
        List<Integer> repeat=Arrays.stream(arr).boxed().filter((item)->!set.add(item)).collect(Collectors.toList());
        repeat.forEach(System.out::println);
    }
}
