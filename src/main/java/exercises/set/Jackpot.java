package exercises.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> win = new HashSet<>();
        for (String str: combination) {
            win.add(str);
        }
        if (win.size() < 2) {
            return true;
        } else {
            return false;
        }
    }
}
