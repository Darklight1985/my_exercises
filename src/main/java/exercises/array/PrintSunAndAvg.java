package exercises.array;

import java.util.Scanner;

public class PrintSunAndAvg {
    public static void printSumAndAvg(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double avg = (double) sum / arr.length;
        String result = String.format("%.1f", avg);
        System.out.printf("%d %s", sum, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSumAndAvg(arr);
    }
}