package com.example.async;

import java.util.concurrent.CompletableFuture;

public class CompFuture {

    public static void main(String[] args) {
        
        CompletableFuture<String> asynCall1 = CompletableFuture.supplyAsync(()->{
            try {
                // calling external API-1
                System.out.println("Starting API-1 calling");
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Successfully completed processing API-1";
        });

            CompletableFuture<String> asynCall2 = CompletableFuture.supplyAsync(()->{
            try {
                // calling external API-2
                System.out.println("Starting API-2 calling");
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Successfully completed processing API-2";
        });
    // asynCall1.thenAccept(t->{System.out.println(t);});
    // asynCall2.thenAccept(t->{System.out.println(t);});

    System.out.println(asynCall1.join());
    System.out.println(asynCall2.join());


    }

}
