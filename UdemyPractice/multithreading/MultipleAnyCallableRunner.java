package com.reanima.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("test1"),
                new CallableTask("test2"),
                new CallableTask("test3"));
        String result = executorService.invokeAny(tasks);

            System.out.println(result);

        executorService.shutdown();
    }
}
