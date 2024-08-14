package exercises.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class test1 {

    public static void main(String[] args) {
        List<Integer> m1 = Arrays.asList(15, 7, 2, 105);
        List<Integer> m2 = Arrays.asList(3, 2, 12 , 7, 15, 1, 0, 100);

        var chislo = m1.stream().reduce(Integer::sum).get();
        System.out.println(chislo);


        /* Отсортировать m2 таким образом, чтобы сначала шли элементы листа m2 (отсортированные по возрастанию) которые есть в m1,
           а дальше все остальные элементы отсортированные по возрастанию.
           итоговый результат 2-7-15-0-1-3-12-100
        */

        Collections.sort(m1);
        Collections.sort(m2);
        List<Integer> list = new ArrayList<>();
        m2.sort((integer, t1) -> {
            var uslovie  = m1.contains(integer);
            var uslovie2 = m1.contains(t1);
            if (uslovie && uslovie2 || !uslovie && !uslovie2) {
                return integer.compareTo(t1);
            } else {
               return uslovie ? - 1 : 1;
            }
        });
//        m2.sort((o1, o2) -> {
//            int res = Boolean.compare(m1.contains(o2), m1.contains(o1));
//            return res != 0 ? res : o1.compareTo(o2);
//        });
        var data = m2.stream().map(s -> s.toString()).reduce((x, y) -> x + "-" + y).get();
        System.out.println(data);
        List<Integer> listM1 = m2.stream().filter(s -> m1.contains(s)).sorted().collect(Collectors.toList());
        List<Integer> listM2 = m2.stream().filter(s -> !m1.contains(s)).sorted().collect(Collectors.toList());
        list.addAll(listM1);
        list.addAll(listM2);
     //   System.out.println(list);


        String a = "aaaabbbbbbcccccdaaaa11111"; //убрать подряд повторяющиеся элементы - abcda1
        var massiv = a.split("");
       // System.out.println(Arrays.stream(a.split("")).reduce((o1, o2) -> o1.endsWith(o2) ? o1 : o1 + o2).get());
//        Set<Character> characters = new LinkedHashSet<>();
        String res = massiv[0];
       for (int i = 1; i < massiv.length; i++) {
            if (!massiv[i].equals(massiv[i - 1])) {
                res = res + massiv[i]; 
            }
        }
        System.out.println(res);
        
    }
}

