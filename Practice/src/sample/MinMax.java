package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
        Optional<Integer> s = nums.stream().min(Integer::compareTo);
        System.out.println(s.get());

        int sumOfValues = nums.stream().reduce(0, Integer::sum);
        int sumValue = nums.stream().reduce(0,(a,b)->a+b);
        System.out.println(sumValue);
    }
}
