package exercises.array;

import java.util.Scanner;

public class FindSameInLine {
    public static int findSameInLine(int[] arr) {
        Integer pred = null;
        int i1 = 1;
        int count = 1;
         for (int i = 0; i < arr.length; i++) {
             Integer val = arr[i];
             if (pred != null && val == pred) {
                 i1++;
             } else {
                 i1 = 1;
             }
             pred = val;
             if (i1 > count) {
                 count = i1;
             }
         }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSameInLine(arr));
    }
}