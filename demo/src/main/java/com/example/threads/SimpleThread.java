package com.example.threads;

import java.util.concurrent.*;

public class SimpleThread {
    public static void main(String args[]) throws ExecutionException, InterruptedException {

//        Runnable runnable1 = ()->functionalityTheater("Test");
//        Runnable runnable2 = ()->functionalityTheater("Result");
        Callable<String> dataInsertion = () -> {
            try {
                String result = insertDatabase("Insertion1");
                return result;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "Failed Insertions";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        executorService.submit(runnable1);
//        executorService.submit(runnable2);

        Future<String> completion = executorService.submit(dataInsertion);

        System.out.println(completion.get());
        executorService.shutdown();

    }

    public static void functionalityTheater(String actionToPerform){
            for (int i=1;i<20;i++) {
                System.out.println(actionToPerform+"-"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public static String insertDatabase(String records) throws InterruptedException {

        Thread.sleep(100);
        System.out.println("Data has been inserted to DB for the Record" + records);
        return "Data has been inserted to DB for the Record" + records;
    }
}