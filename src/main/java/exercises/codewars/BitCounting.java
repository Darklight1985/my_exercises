package exercises.codewars;

public class BitCounting {

    public static int countBits(int n){
        var ch = Integer.bitCount(n);
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(BitCounting.countBits(1234));
    }
}
