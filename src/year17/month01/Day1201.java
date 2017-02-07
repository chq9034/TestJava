package year17.month01;

/**
 * 因互相等待而死锁
 * @author: caihq 
 * @since: 2017年1月12日 下午2:29:13 
 * @history:
 */
public class Day1201 {
    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        Thread0 thread0 = new Thread0(dl);
        Thread1 thread1 = new Thread1(dl);
        thread0.start();
        thread1.start();
    }
}

class Thread0 extends Thread {
    private DeadLock dlDeadLock;

    Thread0(DeadLock dl) {
        this.dlDeadLock = dl;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        dlDeadLock.left2Right();
    }
}

class Thread1 extends Thread {
    private DeadLock dLock;

    public Thread1(DeadLock dlDeadLock) {
        this.dLock = dlDeadLock;
    }

    @Override
    public void run() {
        dLock.right2Left();
    }
}

class DeadLock {
    private final Object left = new Object();

    private final Object right = new Object();

    public void left2Right() {
        synchronized (left) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized (right) {
                System.out.println("right id doing...");
            }
        }
    }

    public void right2Left() {
        synchronized (right) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized (left) {
                System.out.println("left is doing...");
            }
        }
    }

}
