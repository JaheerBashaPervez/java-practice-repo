package com.example.async;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.lang3.time.StopWatch;

public class CompFuture {

    public static void main(String[] args) {

        StopWatch watch = StopWatch.createStarted();

        CompletableFuture<String> asynCall1 = CompletableFuture.supplyAsync(() -> {
            try {
                // calling external API-1
                System.out.println("Starting API-1 calling");
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Successfully completed processing API-1";
        });

        CompletableFuture<String> asynCall2 = CompletableFuture.supplyAsync(() -> {
            try {
                // calling external API-2
                System.out.println("Starting API-2 calling");
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Successfully completed processing API-2";
        });
        // asynCall1.thenAccept(t->{System.out.println(t);});
        // asynCall2.thenAccept(t->{System.out.println(t);});

        System.out.println(asynCall1.join());
        System.out.println(asynCall2.join());

        watch.stop();
        System.out.println("Total Time: " + watch.getTime());
    }

}
