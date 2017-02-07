package year17.month01;

/**
 * jdk8新特性
 * @author: caihq 
 * @since: 2017年1月19日 下午2:43:44 
 * @history:
 */
public class Day1904 {

    public static void main(String[] args) {
        Formula formula = new Formula() {

            @Override
            public double calculate(int a) {

                return a;
            }
        };
        System.out.println(formula.calculate(9));
        System.out.println(formula.sqrt(9));
    }
}

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
