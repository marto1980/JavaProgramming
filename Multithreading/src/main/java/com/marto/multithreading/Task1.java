package com.marto.multithreading;

public class Task1 extends Thread {

  @Override
  public void run() {
    System.out.println("Task 1 Started");

    for (int i = 101; i <= 199; i++) {
      System.out.print(i + " ");
    }

    System.out.println("Task 1 is Done");
  }
}
