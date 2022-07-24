package exercises.sort;

import java.util.Arrays;

/**
 * Пузырьковая сортировка (квадратичная сложность)
 */
public class Bubble implements Sortirovka{
    public void sort(int[] massiv) {
        System.out.println(Arrays.toString(massiv));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < massiv.length; i++) {
                if (massiv[i] < massiv[i - 1]) {
                    swap(massiv, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    public static void main(String[] args) {
        int[] massiv = {10, 2, 10, 3, 1, 2, 5};
        new Bubble().sort(massiv);
    }
}
