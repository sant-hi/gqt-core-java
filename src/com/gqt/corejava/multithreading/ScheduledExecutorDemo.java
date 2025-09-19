package com.gqt.corejava.multithreading;
import java.util.concurrent.*;
public class ScheduledExecutorDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Scheduled task executed at " + System.currentTimeMillis());
        // schedule task with 2-second delay
        scheduler.schedule(task, 2, TimeUnit.SECONDS);
        // schedule task at fixed rate every 1 second
        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
        // run for 5 seconds then shutdown
        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        scheduler.shutdown();
    }
}
