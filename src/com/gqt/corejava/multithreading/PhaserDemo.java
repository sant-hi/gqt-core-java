package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // main thread
        for (int i = 0; i < 3; i++) {
            int threadNum = i;
            phaser.register();
            new Thread(() -> {
                System.out.println("Thread " + threadNum + " working...");
                phaser.arriveAndAwaitAdvance(); // wait for others
                System.out.println("Thread " + threadNum + " done!");
            }).start();
        }
        phaser.arriveAndAwaitAdvance(); // main thread waits
        System.out.println("All threads completed phase");
    }
}
