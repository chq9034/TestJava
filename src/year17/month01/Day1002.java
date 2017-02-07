package year17.month01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

class Data implements Serializable {
    private int i = 0;

    Data(int x) {
        this.i = x;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

}

public class Day1002 implements Serializable {
    private static int r() {
        return (int) new Random().nextInt() * 10;
    }

    private Data[] datas = { new Data(r()), new Data(r()), new Data(r()) };

    private Day1002 next;

    private char c;

    Day1002(int i, char x) {
        System.out.println("i=" + i);
        c = x;
        if (--i > 0) {
            next = new Day1002(i, (char) (x + 1));
        }
    }

    Day1002() {
        System.out.println("default");
    }

    public String toString() {
        String s = ":" + c + "(";
        for (Data data : datas) {
            s += data.toString();
        }
        s += ")";
        if (null != next) {
            s += next.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        Day1002 day1002 = new Day1002(6, 'a');
        System.out.println("day1002");
        System.out.println(day1002);
        System.out.println("=====================================");
        /**
         * 用文件形式实现序列化
         */
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("d:/serializable.out"));
            out.writeObject("day1002");
            out.writeObject(day1002);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                "d:/serializable.out"));
            String name1 = (String) in.readObject();
            Day1002 _dayDay1002 = (Day1002) in.readObject();
            System.out.println(name1);
            System.err.println(_dayDay1002.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
