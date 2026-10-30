package com.example.practice;

@FunctionalInterface
interface PrimeNumber{
    boolean primeCheck(int n);
}

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumber value = number -> {
            if(number==1) return false;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(value.primeCheck(23));
    }
}
