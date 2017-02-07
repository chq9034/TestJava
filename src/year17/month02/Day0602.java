package year17.month02;

/*
 学术问题:
 分析下面代码的执行顺序 -> 研究构造器与有无static
 -> 子类与父类
 -> 自身类与依赖类

 输出结果:
 ---------- java  ----------
 Subclass static block    //ConstructorStaticInitDemo类(后执行)依赖于Subclass类(先执行)
 Superclass [static] block    //无static修饰的代码块在构造器中执行
 Superclass构造器
 Subclass构造器
 构造器
 static block
 main


 */

public class Day0602 {
    private static Day0602 day0602 = new Day0602();

    private Subclass subclass = new Subclass();

    static {
        System.out.println("static block");
    }

    public Day0602() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}

class Superclass {
    Superclass() {
        // -> 执行无static修饰的代码块
        System.out.println("Superclass构造器");
    }

    // 此处若有static,则父类代码块先执行(Superclass [static] block执行完后,再执行Subclass static
    // block)
    {
        System.out.println("Superclass [static] block");
    }
}

class Subclass extends Superclass {

    Subclass() {
        // 隐式的super();
        System.out.println("Subclass构造器");
    }

    // static代码块随字节码加载进JVM中就执行,即随着类的执行而执行
    static {
        System.out.println("Subclass static block");
    }

}
