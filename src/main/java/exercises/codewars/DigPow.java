package exercises.codewars;

public class DigPow {

    public static long digPow(int n, int p) {
        String str = String.valueOf(n);
        double rsl = 0;
        long rsls;
        char [] symb = str.toCharArray();
        for (char ch: symb) {
           rsl = (Math.pow(Integer.parseInt(String.valueOf(ch)), p) + rsl);
           p++;
        }
        rsls = ((rsl/n) > 0 && rsl/n == (long)rsl/n) ? (long) (rsl / n) : -1;
        return rsls;
    }
}
