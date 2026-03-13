package com.marto.multithreading;

// extends Thread
// implements Runnable

public class ThreadBasicsRunner {
  public static void main(String[] args) {
    // Task 1
    System.out.println("Task 1 Kicked Off");
    Task1 task1 = new Task1();
    task1.start();

    // Task 2
    System.out.println("Task 2 Kicked Off");
    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);
    task2Thread.start();

    // Task 3
    System.out.println("Task 3 Kicked Off");
    System.out.println("Task 3 Started");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.println("Task 3 is Done");

    System.out.println("\nmain Method is Done");
  }
}
