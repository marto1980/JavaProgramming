package com.marto.loops;

import java.util.Scanner;

/**
 * @author marto
 */
public class DoWhileRepeatedQuestionRunner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.print("Enter a number: ");
      number = scanner.nextInt();
      if (number > 0) {
        System.out.println("Cube is " + number * number * number);
      }
    } while (number > 0);

    System.out.println("Thank you! Have Fun!");
    scanner.close();
  }
}
