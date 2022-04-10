package exercises.set;

import java.util.Set;

public class Firewall {
    final static String YES = "Вы сделали правильный выбор!";
    public static String checkName(String s, Set<String> words) {
        String rsl = YES;
        for (String str: s.split(" ")) {
            if (words.contains(str)) {
                rsl = "Выберите другую статью...";
            }
        }
        return rsl;
    }
}
