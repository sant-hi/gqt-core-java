package com.gqt.corejava.multithreading;
class ThreadNameDemo extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
public class MultiThreadName {
    public static void main(String[] args) {
        Thread t1 = new ThreadNameDemo();
        Thread t2 = new ThreadNameDemo();
        t1.start();
        t2.start();
    }
}
