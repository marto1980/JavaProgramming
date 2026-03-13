package com.marto.multithreading;

public class ThreadBasicsRunner {
  public static void main(String[] args) {
    // Task 1
    for (int i = 101; i <= 199; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\nTask 1 is Done");

    // Task 2
    for (int i = 201; i <= 299; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\nTask 2 is Done");

    // Task 3
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\nTask 3 is Done");

    System.out.println("\nmain Method is Done");
  }
}
