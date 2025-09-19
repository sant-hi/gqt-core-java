package multiThreading;

import java.util.concurrent.*;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " acquired permit");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " released permit");
                semaphore.release();
            } catch (InterruptedException e) {}
        };

        for (int i = 0; i < 4; i++) new Thread(task, "Thread-" + i).start();
    }
}
