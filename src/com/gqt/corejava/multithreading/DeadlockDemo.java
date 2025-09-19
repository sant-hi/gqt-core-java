package com.gqt.corejava.multithreading;
class Resource {
    void methodA(Resource r) {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " locked " + this);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized(r) {
                System.out.println(Thread.currentThread().getName() + " locked " + r);
            }
        }
    }
}
public class DeadlockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.methodA(r2), "T1");
        Thread t2 = new Thread(() -> r2.methodA(r1), "T2");
        t1.start();
        t2.start();
    }
}
