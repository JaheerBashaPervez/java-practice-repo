package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        Integer[] nums = {
                1,
                7,
                18,
                25,
                77,
                300,
                101
        };

        Optional<Integer> value = Arrays.stream(nums).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(value.get());
    }
}
