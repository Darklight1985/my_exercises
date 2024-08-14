package exercises.array;

import java.util.Arrays;

public class IteratorNull {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, null, 5, 6};

        var iter = Arrays.stream(arr).iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o != null) {
                System.out.println(o);
            }
        }
    }
}
