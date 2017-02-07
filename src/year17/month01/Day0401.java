package year17.month01;

import java.io.File;

/**
 * base64转化图片
 * @author: caihq 
 * @since: 2017年1月3日 上午9:33:31 
 * @history:
 */
public class Day0401 {

    public static void main(String[] args) {
        Day0401 aDay0401 = new Day0401();

        System.out.println(aDay0401.test());
    }

    public String test() {
        File file = new File(".");
        String path = file.getAbsolutePath();
        path = file.getPath();
        System.out.println(path);
        return this.getClass().getClassLoader().getResource("/").getPath();
    }
}
