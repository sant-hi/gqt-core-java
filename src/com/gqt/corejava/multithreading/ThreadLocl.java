package com.gqt.corejava.multithreading;
class ThreadLocalDemo extends Thread {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
    public void run() {
        threadLocal.set((int) (Math.random() * 100));
        System.out.println(getName() + " value: " + threadLocal.get());
    }
}
public class ThreadLocl {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new ThreadLocalDemo().start();
        }
    }
}
