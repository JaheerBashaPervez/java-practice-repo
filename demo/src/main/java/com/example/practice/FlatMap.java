package com.example.practice;

import java.util.List;
import java.util.stream.Collectors;

import com.example.model.DatabaseCustomers;

public class FlatMap {

    public static void main(String[] args) {
        
         List<String> list = DatabaseCustomers.getCustomers().stream().flatMap((phoneNumber)-> phoneNumber.getPhoneNumbers().stream()).collect(Collectors.toList());
        //List<String> list = DatabaseCustomers.getCustomers().stream().flatMap((phoneNumber)-> phoneNumber.getPhoneNumbers().stream()).toList();
        list.add("20");

        list.forEach(t->System.out.println(t));
    }
}
