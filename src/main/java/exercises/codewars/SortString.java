package exercises.codewars;

import java.util.Arrays;
import java.util.List;

public class SortString {
    public static String sortStr(String words) {
        String rsl = "";
        List<String> sort = Arrays.stream(words.split(" ")).toList();
        for (int i = 1; i < 10; i++) {
            for (String word: sort) {
                if (word.contains(String.valueOf(i))) {
                    rsl = rsl + " " + word;
                }
            }
        }
        return rsl.strip();
    }


    public static void main(String[] args) {
        System.out.println(SortString.sortStr("Thi1s is2 3a T4est"));
        System.out.println(SortString.sortStr("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(SortString.sortStr(""));
    }
}
