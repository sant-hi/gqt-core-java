package com.gqt.corejava.multithreading;
class JoinDemo extends Thread {
    public JoinDemo(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " started");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println(getName() + " finished");
    }
}
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1 = new JoinDemo("T1");
        JoinDemo t2 = new JoinDemo("T2");
        t1.start();
        t1.join(); // wait for t1 to finish
        t2.start();
        t2.join(); // wait for t2 to finish
        System.out.println("Both threads finished execution");
    }
}
