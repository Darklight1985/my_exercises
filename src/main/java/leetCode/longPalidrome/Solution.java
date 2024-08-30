package leetCode.longPalidrome;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String longestPalindrome(String s) {
        String palindromes = null;
        String longestPalindrome = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    palindromes = (s.substring(i, j));
                    if ((longestPalindrome == null) || longestPalindrome.length()  < palindromes.length()) {
                        longestPalindrome = palindromes;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
    }
}
