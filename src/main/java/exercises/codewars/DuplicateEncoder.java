package exercises.codewars;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateEncoder {
    static String encode(String word){
        List<Character> chars = new ArrayList<>();
       StringBuilder sb = new StringBuilder();
       char[] characters = word.toLowerCase().toCharArray();
       for (Character ch: characters) {
           chars.add(ch);
       }
        for (Character ch: characters) {
            if (Collections.frequency(chars, ch) > 1) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(DuplicateEncoder.encode("Prespecialized"));
    }
}

