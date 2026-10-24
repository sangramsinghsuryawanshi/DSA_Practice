package dsa.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class virtualThread {
    public static void main(String[] args) {

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 1000; i++) {
                executor.submit(() -> {
                    // Simulate a task
                    System.out.println("Task running");
                });
            }
        }
    }
}
