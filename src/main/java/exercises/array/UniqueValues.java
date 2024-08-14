package exercises.array;

import java.util.Scanner;
public class UniqueValues {
    public static int uniqueValues(int[] arr){
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            for (int j = i; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    check = false;
                }
            }
            if (check) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueValues(arr));
    }
}
