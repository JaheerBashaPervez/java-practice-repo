package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringConvertions {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,15,16,49,25,98,32,1154);
//        myList.stream().map(Object::toString)
//                .filter(x->x.startsWith("1"))
//                .forEach(System.out::println);

        System.out.println("*************");

        Set<Integer> setValues = new HashSet<>();
        myList.stream().filter(x->!setValues.add(x)).forEach(System.out::println);
    }
}
