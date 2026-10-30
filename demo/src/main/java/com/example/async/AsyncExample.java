package com.example.async;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncExample {

    public static void main(String[] args) {
        System.out.println("[" + Thread.currentThread().getName() + "] Main thread starts.");

        // 1. Trigger the asynchronous call
        CompletableFuture<String> asyncCall = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("[" + Thread.currentThread().getName() + "] Fetching data from API...");
                TimeUnit.SECONDS.sleep(2); // Simulate network latency
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Success: API Data Received!";
        });

        // 2. Define a non-blocking callback to handle the result when ready
        asyncCall.thenAccept(result -> {
            System.out.println("[" + Thread.currentThread().getName() + "] Callback received: " + result);
        });

        // 3. Main thread continues immediately without waiting
        System.out.println("[" + Thread.currentThread().getName() + "] Main thread continues doing other work...");

        // Keep the main thread alive just for this demo so the background thread can finish
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Main thread ends.");
    }
}
