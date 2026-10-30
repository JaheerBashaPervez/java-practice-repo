package com.example.practice;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.example.model.Human;


public class GroupByVariable {
    public static void main(String[] args) {
        
    
    List<Human> listHuman = Arrays.asList(new Human(23,"Jaheer", "Urdu"),
            new Human(23,"Jaheer1", "Urdu"),
            new Human(23,"Jaheer2", "Urdu1"),
            new Human(26,"jaheer3","Telugu"),
            new Human(23,"Jaheer4", "Telugu"),
            new Human(23,"Jaheer5", "Telugu"));
        Map<String, List<Human>> groupLanguage = listHuman.stream().collect(Collectors.groupingBy(human->human.getLanguage()));

        groupLanguage.entrySet().forEach(System.out::println);
    }
}
