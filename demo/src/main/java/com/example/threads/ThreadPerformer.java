package com.example.threads;

public class ThreadPerformer {
    public static void main(String args[]){

        FirstThread task1 = new FirstThread("Print Ticket");
        FirstThread task2 = new FirstThread("Show Ticket");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

    }
}
