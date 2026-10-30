package com.example.practice;

final public class Customer {
    private final String name;
    private final int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ImmutableClasses{

    public static void main(String[] args) {
    Customer cs = new Customer("jaheer",23);
    Customer cs1 = new Customer("jaheer2",26);
        System.out.println(cs1.getAge()+cs1.getName());
    }

        }