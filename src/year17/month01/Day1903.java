package year17.month01;

import java.util.Arrays;
import java.util.List;

public class Day1903 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2");
        for (String str : toArray(list)) {
            System.out.println(str);
        }
    }

    private static <T> T[] toArray(List<T> list) {
        T[] t = (T[]) new Object[list.size()];
        for (int i = 0, s = list.size(); i < s; i++) {
            t[i] = list.get(i);
        }
        return t;
    }
}
