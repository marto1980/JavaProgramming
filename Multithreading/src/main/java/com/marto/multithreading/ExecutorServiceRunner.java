package com.marto.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService.execute(new Task1());
    executorService.execute(new Thread(new Task2()));

    // Task 3
    System.out.println("Task 3 Kicked Off");
    System.out.println("Task 3 Started");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.println("Task 3 is Done");

    System.out.println("\nmain Method is Done");

    executorService.shutdown();
  }
}
