package year17.month01;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import year17.month01.Factory.User;

public class Day1101 {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.setUser(User.WORKER);
        for (int i = 0; i < 100; i++) {
            Thread sb = new Thread(factory);
            sb.start();
        }

        factory.setUser(User.BUYER);
        for (int i = 0; i < 100; i++) {
            Thread sb = new Thread(factory);
            sb.start();
        }
    }
}

class Product {
    private int i;

    Product(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "[i:" + i + "]";
    }

    public String getI() {
        return Integer.toString(i);
    }

}

class Factory implements Runnable {
    private User user = User.WORKER;

    private int i = 0;

    private static Queue<Product> queue = new LinkedBlockingQueue<Product>();

    public Factory(User a) {
        this.user = a;
    }

    public Factory() {
    }

    enum User {
        WORKER, BUYER;
    }

    @Override
    public void run() {
        if (user.equals(User.WORKER)) {
            Product p = new Product(++i);
            queue.add(p);
            System.out.println("生产一件：" + p.getI());
        } else if (user.equals(User.BUYER)) {
            Product p = queue.poll();
            System.out.println("卖出一件：" + p.getI());

        }
    }

    public void setUser(User user) {
        this.user = user;
    }

}
