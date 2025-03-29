package com.santos.hashset.src.stream;

import java.util.*;
import java.util.stream.*;

public class FindMaxElement{
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        /* or we can try using below way */
        int[] arr = {10,15,8,49,25,98,98,32,15};

//        int maxdata = Arrays.stream(arr).boxed()
//                .max((ele,ele1)->{
//                    return (int) (ele-ele1);
//        }).get();
        int maxdata = Arrays.stream(arr).boxed()
                .max(Comparator.comparingInt(Integer::intValue)).get();

        System.out.println(maxdata);
    }
}
