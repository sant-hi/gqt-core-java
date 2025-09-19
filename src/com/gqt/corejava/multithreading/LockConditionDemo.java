package multiThreading;

import java.util.concurrent.locks.*;

class SharedResource {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean available = false;

    public void produce() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("Producing...");
            available = true;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (!available) {
                condition.await();
            }
            System.out.println("Consuming...");
            available = false;
        } finally {
            lock.unlock();
        }
    }
}

public class LockConditionDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new Thread(() -> {
            try { resource.produce(); } catch (InterruptedException e) {}
        }).start();

        new Thread(() -> {
            try { resource.consume(); } catch (InterruptedException e) {}
        }).start();
    }
}
