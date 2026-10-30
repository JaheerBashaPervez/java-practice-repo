package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureExe {

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        List<ProcessRequest> processList = new ArrayList<>();
        CompletableFuture<List<ProcessRequest>> firstTask = CompletableFuture.supplyAsync(()-> {
                    for(int i =1;i<100000; i++){
                        if(i%2==0) processList.add(new ProcessRequest(i,"SUCCESS"));
                        else processList.add(new ProcessRequest(i,"FAILED"));
                    }
                    return processList;
        });
        CompletableFuture<Void> secondTask = firstTask.thenAccept(processlist ->
            processList.forEach(process->System.out.println(process.getRequestStatus()) ));

        secondTask.get();

    }
}
