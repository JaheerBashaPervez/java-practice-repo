package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Language {
    public static void main(String args[]){
        // List<String> languageList = List.of("Hindi","Telugu","English","English");
        List<String> languageList = Arrays.asList("Hindi","Telugu","English","English");
        HashMap<String, Integer> hashMap= new HashMap<>();

        languageList.forEach((lan)->{
            if(hashMap.containsKey(lan)){
               hashMap.put(lan,hashMap.get(lan)+1);
            }
            else
            hashMap.put(lan,1);
        });

        System.out.print(hashMap);
    }
}