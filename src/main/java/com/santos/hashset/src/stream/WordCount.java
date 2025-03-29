package com.santos.hashset.src.stream;

import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Java is awesome Java is simple";

        // Step 2: Split the string into words and count occurrences
        Map<String, Long> wordCount = Arrays.stream(input.split(" "))  // Convert to lowercase and split by spaces
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));  // Group and count occurrences

        // Step 3: Display the result
        wordCount.forEach((word, count) -> System.out.println(word + " : " + count));
    }
}
