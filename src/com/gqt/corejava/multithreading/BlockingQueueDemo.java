package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(() -> {
            try {
                queue.put(1);
                System.out.println("Produced 1");
                queue.put(2);
                System.out.println("Produced 2");
            } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumed " + queue.take());
                System.out.println("Consumed " + queue.take());
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}
