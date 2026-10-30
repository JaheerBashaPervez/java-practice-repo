package restApi;


import Threads.ProcessRequest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RestFul {

    public static void main(String args[]){

        Map<ProcessRequest, Integer> procList = new HashMap<>();
        procList.put(new ProcessRequest(1,"Success"),5);
        procList.put(new ProcessRequest(2,"Failed"),2);


        System.out.println(procList.get(new ProcessRequest(1,"Success")));
    }
}
