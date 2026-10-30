package com.example.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        String input = "jaheer";
        Map<String, Long> values = Arrays.stream(input.split(""))
                                   .collect(Collectors.groupingBy(in -> in, Collectors.counting()));
//                .entrySet().stream()
//                .filter(fi->fi.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
//    }
        values.entrySet().stream().forEach(System.out::println);
    }
}