package exercises.sort;

import java.util.Arrays;

/**
 * Сортировка вставкой (квадратичная сложность)
 */
public class Insertion implements Sortirovka{
    public void sort(int[] massiv) {
        System.out.println(Arrays.toString(massiv));
        for (int left = 0; left < massiv.length; left++) {
            int value = massiv[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < massiv[i]) {
                    massiv[i + 1] = massiv[i];
                } else {
                    break;
                }
            }
            massiv[i + 1] = value;
        }
        System.out.println(Arrays.toString(massiv));
    }

    public static void main(String[] args) {
        int[] massiv = {10, 2, 10, 3, 1, 2, 5};
        new Selection().sort(massiv);
    }
}
