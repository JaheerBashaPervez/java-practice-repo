package com.example.practice;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesArray {
    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Mad","SAD","Angry","Happy","Angry","Happy","Angry","Happy","Happy","Happy");

        Map<String, Long> counting = languages.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println( counting.entrySet().stream()
                            .filter(fi->fi.getValue()==1)
                            .map(Map.Entry::getValue)
                            .collect(Collectors.toList()));

        counting.entrySet().forEach(System.out::println);
    }
}