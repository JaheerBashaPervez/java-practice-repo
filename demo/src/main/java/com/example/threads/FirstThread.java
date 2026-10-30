package com.example.threads;

public class FirstThread implements Runnable{
    String actionToPerform;

    FirstThread(String str){
        this.actionToPerform=str;
    }


    @Override
    public void run() {
        for (int i=1;i<20;i++) {
            System.out.println(actionToPerform+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

