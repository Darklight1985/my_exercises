package exercises.codewars;

public class ExpandedForm
{
    public static String expandedForm(int num)
    {
        var numStr = String.valueOf(num);
        String res = "";
        for (int i = 0; i < numStr.length(); i++) {
            if (!String.valueOf(numStr.charAt(i)).equals("0")) {
                int answer = Integer.valueOf(String.valueOf(numStr.charAt(i))) * (int) Math.pow(10, (numStr.length() - i - 1));
                res = (res.equals("")) ? String.valueOf(answer) : res + " + " + answer;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ExpandedForm.expandedForm(702));
    }
}
