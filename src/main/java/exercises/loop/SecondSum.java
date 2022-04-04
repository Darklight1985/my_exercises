package exercises.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
         int num = 0;
        for (int i = a; i <= b; i++) {
            if (num % 2 == 0) {
                sum += i;
            }
            num++;
        }
        return sum;
    }
}

