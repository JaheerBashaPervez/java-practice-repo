package sample;

import java.util.Arrays;
import java.util.List;

public class SearchWord {
    public static void main(String[] args) {
        List< String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        boolean found = colors.stream().anyMatch(s -> s.contains("Blue"));
        System.out.println(found);
    }
}
