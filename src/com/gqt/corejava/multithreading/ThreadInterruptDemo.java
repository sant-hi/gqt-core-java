package com.gqt.corejava.multithreading;
class InterruptDemo extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
    }
}
public class ThreadInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        InterruptDemo t1 = new InterruptDemo();
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
