package exercises.codewars;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd=0;
        for (int item: a)
        {
            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(FindOdd.findIt(new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }
}
