package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateValues {
    public static void main(String[] args) {
        String str = "jaheerbashapervez";

        List<String> finalOutPut = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(finalOutPut);
    }
}
