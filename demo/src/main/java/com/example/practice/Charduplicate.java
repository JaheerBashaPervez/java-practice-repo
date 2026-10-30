package com.example.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Charduplicate {
    public static void main(String[] args) {
    int[] intArray = {0,1,0,1,1,0};

//    Arrays.sort(intArray, Collections.reverseOrder());
//    Arrays.stream(intArray).forEach(System.out::println);

    Arrays.sort(intArray);
    Arrays.stream(intArray).forEach(System.out::println);

    }
}
