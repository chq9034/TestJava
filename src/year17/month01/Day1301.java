package year17.month01;

public class Day1301 {
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 0;
        };
    };

    public int getNextNum() {
        threadLocal.set(threadLocal.get() + 1);
        return threadLocal.get();
    }

    public static void main(String[] args) {
        Day1301 tNum = new Day1301();
        ThreadTest ts0 = new ThreadTest(tNum);
        ThreadTest ts1 = new ThreadTest(tNum);
        ThreadTest ts2 = new ThreadTest(tNum);
        ts0.start();
        ts1.start();
        ts2.start();
    }

}

class ThreadTest extends Thread {
    private Day1301 tNum;

    public ThreadTest(Day1301 tn) {
        this.tNum = tn;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("ThreadName:["
                    + Thread.currentThread().getName() + "], "
                    + tNum.getNextNum());
        }

    }
}
