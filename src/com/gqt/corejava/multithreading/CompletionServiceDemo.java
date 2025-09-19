package multiThreading;

import java.util.concurrent.*;

public class CompletionServiceDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletionService<String> service = new ExecutorCompletionService<>(executor);

        service.submit(() -> { Thread.sleep(1000); return "Task1 done"; });
        service.submit(() -> { Thread.sleep(500); return "Task2 done"; });

        for (int i = 0; i < 2; i++) {
            Future<String> result = service.take(); // blocks until next is done
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
