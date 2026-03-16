package com.marto.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes"));
    System.out.println("new CallableTask(\"in28Minutes\") executed");
    String welcomeMessage = welcomeFuture.get();
    System.out.println(welcomeMessage);
    System.out.println("Main completed");
  }
}
