package com.example.practice;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDuplicates {
    public static void main(String[] args) {
        String str = "jaheerbashapervezy";

        List<String> value = Arrays.stream(str.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().filter(a -> a.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println(value);
    }
}
