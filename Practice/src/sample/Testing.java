package sample;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Testing {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,6,7,2,3,7,4,2,8);

        List<Integer> finalResult = integerList.stream()
                                                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                                                .entrySet().stream()
                                                .filter(s -> s.getValue() == 1)
                                                .map(Map.Entry::getKey)
                                                .toList();

//        Predicate<String> check = String:: isEmpty;
//        System.out.println(check.test("asdf"));
//        System.out.println(finalResult);

        integerList.stream().filter(x->x%2==0).forEach(System.out::println);
        // Creates Immutable List
        List<Integer> immutableList = integerList.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> mutableList = integerList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());


    }
}
