package exercises.lemonade;

class Solution {
    public static boolean lemonadeChange(int[] bills) {
        boolean result = true;
        int[] coints = new int[4];
        for (int bill : bills) {
            int change = bill - 5;
            int row = (bill) / 5 - 1;
            coints[row]++;
            row--;
            while (row >= 0) {
                if (change == 0) {
                    break;
                }
                if (coints[row] == 0) {
                    row--;
                    continue;
                }
                int money = (row + 1) * 5;
                if (money > change) {
                    row--;
                    continue;
                }
                change = change - money;
                coints[row]--;
            }
            if (change > 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] bills = new int[]{5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }
}
