package exercises.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (j < left.length) {
                rsl[i] = (left[j] >= right[k]) ? right[k++] : left[j++];
            } else {
                rsl[i] = right[k++];
            }
        }
        return rsl;
    }
}
