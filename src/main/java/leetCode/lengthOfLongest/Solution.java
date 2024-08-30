package leetCode.lengthOfLongest;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        Set<String> characters = new HashSet<>();
        if (s.length() <= 1) {
            return s.length();
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(s.length() - 1))
        {
            return 1;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length() - 1; j++) {
                String currChar = (s.substring(j, j + 1));
                if (characters.contains(currChar)) {
                    characters.clear();
                    characters.add(currChar);
                } else {
                    characters.add(currChar);
                    if (characters.size() > count) {
                        count = characters.size();
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("au"));
    }
}
