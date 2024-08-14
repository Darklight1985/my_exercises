package exercises.regex;

import java.util.regex.Pattern;

public class CheckNumber {
    public static void main(String[] args) {

        String[] strings = new String[] {"р963ов198", "0000ВВ78"};

        for (String number: strings) {
            Integer i = 0;

            if (Pattern.matches(TypeRegNumber.RUSSIA.getRegex(), number)) {
                i++;
            }
            if (Pattern.matches(TypeRegNumber.BELARUS.getRegex(), number)) {
                if (check(i, number)) {
                    continue;
                }
            }
            if (Pattern.matches(TypeRegNumber.KAZAKHSTAN.getRegex(), number)) {
                if (check(i, number)) {
                    continue;
                }
            }
            if (Pattern.matches(TypeRegNumber.KYRGYZSTAN.getRegex(), number)) {
                if (check(i, number)) {
                    continue;
                }
            }
            if (i == 0) {
                System.out.println(number + " - не попадает ни под одно регулярное выражение");
                continue;
            }
        }
    }

    private static boolean check(Integer i, String number) {
        if (i > 0) {
            System.out.println(number + " - попадает под несколько регулярных выражений");
            return true;
        }
        i++;
        return false;
    }
}
