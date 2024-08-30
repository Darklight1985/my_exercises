package ZigZagConv;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        if (numRows >= s.length() || numRows <= 1) {
            return s;
        }
        int k = numRows * 2 - 2;
        StringBuilder characters;
        for (int i = 0; i < s.length(); i++) {
            int j = i % k;
            if (j < numRows) {
                characters = rows.get(j);
            } else {
                characters = rows.get(k - j);
            }
            characters.append(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : rows) {
            sb.append(row);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = solution.convert("A", 1);
        System.out.println(str);
    }
}
