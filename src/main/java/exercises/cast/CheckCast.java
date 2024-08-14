package exercises.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckCast {

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        Object i = 5;
        Object d = 2;
        float f = 1.2f;
        Map<String, Integer> map = new HashMap<>();
        String[] strings = new String[]{"abc", "def", null};
        Set<String> set = Arrays.stream(strings).collect(Collectors.toSet());

        if (list instanceof List) {
            System.out.println("yes");
        }


        if (list instanceof Map map1) {
            System.out.println("yes");
        }

        if (d instanceof Integer due) {
            System.out.println("Да не целое");
            System.out.println(due);
        }

        if (d instanceof Number) {
            System.out.println("Да это число");
        }

        System.out.println(set);

        System.out.println(set.contains(null));
    }
}
