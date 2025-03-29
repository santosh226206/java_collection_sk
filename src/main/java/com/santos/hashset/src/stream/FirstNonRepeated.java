package com.santos.hashset.src.stream;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class FirstNonRepeated{
    public static void main(String args[]) {
        String input = "Java articles are Awesome";

        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        /* or can also try using */

//        Character che=input.chars().mapToObj(c -> (char) c)
//                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
//                .findFirst().orElse(null);
//        System.out.println("--------------------////////////////////----------------------");
//        System.out.println(che);
        Character che=input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);
        System.out.println("--------------------////////////////////----------------------");
        System.out.println(che);
    }
}
