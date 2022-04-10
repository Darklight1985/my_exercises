package exercises.list;

import java.util.List;

public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.removeAll(right);
        left.retainAll(middle);
        return left;
    }
}
