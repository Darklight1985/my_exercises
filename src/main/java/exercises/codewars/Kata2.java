package exercises.codewars;

import java.util.Arrays;

import static java.util.stream.IntStream.range;

public class Kata2 {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        return range(0, n).mapToObj(i -> i % 2 > 0 ? secondValue : firstValue).toArray(String[]::new);
    }

    public static void main(String[] args) {
        var strs = Kata2.alternate(5, "true", "false");
        Arrays.stream(strs).toList().forEach(s -> System.out.println(s));
    }
}