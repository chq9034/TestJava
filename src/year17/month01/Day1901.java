package year17.month01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1901 {

    public static void main(String[] args) {
        List list = Day1901.asList(1, 2, 3.0);
    }

    private static <T> List<T> asList(T... t) {
        List<T> list = new ArrayList<T>();
        Collections.addAll(list, t);
        return list;
    }

}
