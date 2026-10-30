package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemovingDuplicate {
    public static void main(String[] args) {
        String str = "jaheerbashapervezy";

        List<String> uniqueList = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(uniqueList);
    }

}
