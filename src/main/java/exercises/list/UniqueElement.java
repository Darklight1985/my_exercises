package exercises.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        boolean rsl = (list.indexOf(str) == -1 || list.indexOf(str) != list.lastIndexOf(str)) ? false : true;
        return rsl;
    }
}
