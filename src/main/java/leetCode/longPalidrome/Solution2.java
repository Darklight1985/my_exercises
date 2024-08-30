package leetCode.longPalidrome;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.longestPalindrome("bb"));
    }

    public String longestPalindrome(String s) {
        String res = null;
        for (int i = 0; i < s.length(); i++) {
            String length = getLengthOfLongestPalindrome(s, i, i);
            String length2 = getLengthOfLongestPalindrome(s, i, i + 1);
            if (length != null && (res == null || length.length() > res.length())) {
                res = length;
            }
            if (length2 != null && (res == null || length2.length() > res.length())) {
                res = length2;
            }
        }
       return res;
    }

    public String getLengthOfLongestPalindrome(String s, int min, int max) {
        String res = null;
            while (min >= 0 && max < s.length() && s.charAt(min) == s.charAt(max)) {
                res = s.substring(min, max + 1);
                min--;
                max++;
            }
        return res;
    }
}
