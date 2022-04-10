package exercises.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        List<String> rsl = new ArrayList<>();
        int freq = Collections.frequency(list, el);
       if (freq > 1) {
           rsl = list.subList(list.indexOf(el), list.lastIndexOf(el));
       }
        return rsl;
    }
}
