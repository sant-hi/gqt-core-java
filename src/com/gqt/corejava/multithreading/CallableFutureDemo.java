package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };
        Future<Integer> future = executor.submit(task);
        System.out.println("Result from callable: " + future.get());
        executor.shutdown();
    }
}
