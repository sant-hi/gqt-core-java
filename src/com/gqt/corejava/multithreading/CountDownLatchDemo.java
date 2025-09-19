package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " finished task");
            latch.countDown();
        };
        new Thread(task, "T1").start();
        new Thread(task, "T2").start();
        new Thread(task, "T3").start();
        latch.await(); // wait until count reaches 0
        System.out.println("All threads finished, main thread proceeding");
    }
}
