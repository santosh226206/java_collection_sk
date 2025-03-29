package com.santos.hashset.src.stream;

// Program to convert
// the Stream to Map

import java.io.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Map;

class StreamPractise {
    public static Map toMap(String input)
    {
        Map<String, Integer> lengthMap
                = Arrays.stream(input.split(" "))
                .collect(Collectors.toMap(
                        value
                                -> value,
                        value -> value.length()));

        return lengthMap;
    }
    public static void main(String[] args)
    {
        String input = "Hey Bhai how are you";

        System.out.println(toMap(input));
    }
}

