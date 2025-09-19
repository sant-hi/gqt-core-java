package multiThreading;

import java.util.concurrent.*;

public class ExecutorsFrameworkDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> System.out.println("Task1 executed by " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Task2 executed by " + Thread.currentThread().getName());

        executor.execute(task1);
        executor.execute(task2);

        executor.shutdown();
    }
}
