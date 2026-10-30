package com.example.practice;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        String str = "This is a beautiful film that was made in 1990";
        long n = Arrays.stream(str.split(" ")).count();
        System.out.println(n);
    }
}
