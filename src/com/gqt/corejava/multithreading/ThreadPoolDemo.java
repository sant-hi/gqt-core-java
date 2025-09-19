package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskNum = i;
            executor.submit(() -> {
                System.out.println("Executing task " + taskNum + " by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
