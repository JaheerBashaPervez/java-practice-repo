package com.example.practice;

@FunctionalInterface
interface Calculate{

    int addition(int x);

}

public class FunInterFace {

    public static void main (String args[]){

        Calculate y =  x-> x+x;
        System.out.println(y.addition(30));


    }
}
