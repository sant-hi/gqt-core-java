package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached barrier"));
        for (int i = 0; i < 3; i++) {
            int threadNum = i;
            new Thread(() -> {
                System.out.println("Thread " + threadNum + " waiting at barrier");
                try { barrier.await(); } catch (Exception e) {}
                System.out.println("Thread " + threadNum + " passed barrier");
            }).start();
        }
    }
}
