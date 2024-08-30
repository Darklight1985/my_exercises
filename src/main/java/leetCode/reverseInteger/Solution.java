package leetCode.reverseInteger;

public class Solution {
    public int reverse(int x) {
        int negative = 1;
        Long chislo = Long.valueOf(x);
        if (chislo == 0 || chislo >= Integer.MAX_VALUE || chislo <= Integer.MIN_VALUE) {
            return 0;
        }
        if (chislo < 0) {
            negative = - 1;
        }
        String s = String.valueOf(Math.abs(x));
        s = new StringBuilder(s).reverse().toString();
        Long res = Long.parseLong(s);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return negative * Integer.valueOf(s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-2147483648));
    }
}
