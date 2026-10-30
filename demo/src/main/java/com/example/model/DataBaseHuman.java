package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHuman {

    static List<Human> humanList = new ArrayList<Human>();

    public static List<Human> getHumanData(){
       

        humanList.add(Human.builder().age(33).name("Jaheer").language("Urdu").build());
        humanList.add(Human.builder().age(28).name("Nazia").language("Urdu").build());
        humanList.add(Human.builder().age(1).name("Maryam").language("Urdu").build());
        humanList.add(Human.builder().age(37).name("Akbar").language("Urdu").build());
        humanList.add(Human.builder().age(35).name("Jeelan").language("Urdu").build());
        humanList.add(Human.builder().age(35).name("Jeelan").language("Urdu").build());
        return humanList;
    }

}
