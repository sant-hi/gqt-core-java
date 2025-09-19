package com.gqt.corejava.multithreading;
class SyncDemo {
    public void display(int num) {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " : " + num);
        }
    }
}
public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        SyncDemo obj = new SyncDemo();
        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) obj.display(i);
        };
        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}
