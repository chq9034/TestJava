package year17.month01;

public class Day0301 {

    public static void main(String[] args) {
        System.out.println(delete("你好", "你").equals("好"));
        System.out.println(delete("$好", "$").equals("好"));
    }

    public static String delete(String string, String sub) {
        return string.replaceAll(sub, "");// replaceAll接受参数是正则表达式
    }

}
