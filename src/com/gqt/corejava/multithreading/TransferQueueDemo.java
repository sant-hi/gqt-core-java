package multiThreading;

import java.util.concurrent.*;

public class TransferQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> queue = new LinkedTransferQueue<>();

        new Thread(() -> {
            try {
                System.out.println("Producer transferring message...");
                queue.transfer("Hello from Producer");
                System.out.println("Message transferred");
            } catch (InterruptedException e) {}
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(500);
                System.out.println("Consumer received: " + queue.take());
            } catch (InterruptedException e) {}
        }).start();
    }
}
