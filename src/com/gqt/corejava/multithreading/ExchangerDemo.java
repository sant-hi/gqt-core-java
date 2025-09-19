package multiThreading;

import java.util.concurrent.*;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String data = "Data from T1";
                System.out.println("T1 sending: " + data);
                String received = exchanger.exchange(data);
                System.out.println("T1 received: " + received);
            } catch (InterruptedException e) {}
        }).start();

        new Thread(() -> {
            try {
                String data = "Data from T2";
                System.out.println("T2 sending: " + data);
                String received = exchanger.exchange(data);
                System.out.println("T2 received: " + received);
            } catch (InterruptedException e) {}
        }).start();
    }
}
