package exercises.codewars;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateEncoder2 {

    public static void main(String[] args) {
        String document = (" РЕ671048").replaceAll("\\s+", "");
        System.out.println(document.chars().allMatch(Character::isDigit));
    }
}

