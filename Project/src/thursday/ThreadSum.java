package thursday;

import java.util.*;

public class ThreadSum implements Runnable {

    int a;

    public ThreadSum(int a)
    {
        this.a = a;
    }

    public void run()
    {
        addRondom();
    }

    public void addRondom() {
        Random s = new Random();
        int n = s.nextInt(10) + 1;
        System.out.println("number : " + n);
        synchronized (this) {
            a += n;
        }
    }

public static void main(String[] args) {
    int base = 0;

    ThreadSum sum = new ThreadSum(base);

    Thread t1 = new Thread(sum);
    Thread t2 = new Thread(sum);
    Thread t3 = new Thread(sum);
    Thread t4 = new Thread(sum);
    Thread t5 = new Thread(sum);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    try {
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
    } 
    catch (InterruptedException e) 
    {
        e.printStackTrace();
    }

    System.out.print("final sum: " + sum.a);
   }
}