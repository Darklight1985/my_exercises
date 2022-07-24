package exercises.sort;

import java.util.Arrays;

/**
 * Простая сортировка выборкой (квадратичная сложность)
 */
public class Selection implements Sortirovka{
    public void sort(int[] massiv) {
        System.out.println(Arrays.toString(massiv));
        for (int left = 0; left < massiv.length; left++) {
            int minInd = left;
            for (int i = left; i < massiv.length; i++) {
                if (massiv[i] < massiv[minInd]) {
                    minInd = i;
                }
            }
            swap(massiv, left, minInd);
        }
        System.out.println(Arrays.toString(massiv));
    }

    public static void main(String[] args) {
        int[] massiv = {10, 2, 10, 3, 1, 2, 5};
        new Selection().sort(massiv);
    }
}
