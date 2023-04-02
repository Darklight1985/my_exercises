package exercises.codewars;

class Solution {
    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0:
                yield "no one likes this";
            case 1:
                yield names[0] + " likes this";
            case 2:
                yield names[0] + " and " + names[1] +  " like this";
            case 3 :
                yield names[0] + ", " + names[1] + " and " + names[2] + "like this";
            default:
                yield names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        };
    }
}
