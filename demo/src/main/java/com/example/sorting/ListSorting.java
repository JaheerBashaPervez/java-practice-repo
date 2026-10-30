package com.example.sorting;

import java.util.List;

import com.example.model.DataBaseHuman;
import com.example.model.Human;

public class ListSorting {
    public static void main(String[] args) {
        List<Human> sortedList = DataBaseHuman.getHumanData();
        System.out.println(sortedList.size());
        sortedList.sort((c1,c2)->c1.getAge()-c2.getAge());
        sortedList.forEach(e->System.out.println(e.toString()));

    }

}
