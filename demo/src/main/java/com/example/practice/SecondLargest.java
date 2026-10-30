package com.example.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(3, 14, 25, 25, 9, 11);
        Optional<Integer> number = list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();
        System.out.println(number.get());

    }

}
