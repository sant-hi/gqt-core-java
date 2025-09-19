package com.gqt.corejava.multithreading;
class ThreadPriorityDemo extends Thread {
    public void run() {
        System.out.println(getName() + " has priority " + getPriority());
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        Thread t1 = new ThreadPriorityDemo();
        Thread t2 = new ThreadPriorityDemo();
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10
        t1.start();
        t2.start();
    }
}
