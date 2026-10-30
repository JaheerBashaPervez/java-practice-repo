package com.example.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Person{
    private int id;
    private String name;
    private double salary;
    private Departments department;
}

enum Departments{
    HR,
    Finance,
    ADMIN
}

public class GroupByClass {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person(1, "Alex", 100d, Departments.HR),
                new Person(2, "Brian", 200d, Departments.ADMIN),
                new Person(3, "Charles", 900d, Departments.Finance),
                new Person(4, "David", 200d, Departments.HR),
                new Person(5, "Edward", 200d, Departments.Finance),
                new Person(6, "Frank", 800d, Departments.HR),
                new Person(7, "George", 900d, Departments.HR));

        Map<Departments, List<Person>> depPersonMapping = persons.stream().collect(Collectors.groupingBy(Person::getDepartment));
        depPersonMapping.entrySet().forEach(System.out::println);

    }
}
