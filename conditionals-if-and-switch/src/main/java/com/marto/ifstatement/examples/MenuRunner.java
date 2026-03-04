package com.marto.ifstatement.examples;

import java.util.Scanner;

/**
 * @author marto
 */
public class MenuRunner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number1: ");
    int number1 = scanner.nextInt();
    System.out.println("The number you entered is - " + number1);

    System.out.println("Enter number2: ");
    int number2 = scanner.nextInt();
    System.out.println("The number you entered is - " + number2);

    System.out.println("Choices are:");
    System.out.println("1 - Add");
    System.out.println("2 - Subtract");
    System.out.println("3 - Divide");
    System.out.println("4 - Multiply");

    System.out.println("Choose Operation: ");
    int operation = scanner.nextInt();

    System.out.println("You selected:");
    System.out.println("Number1: " + number1);
    System.out.println("Number2: " + number2);
    System.out.println("Operation number: " + operation);

    if (operation == 1) {
      int result = number1 + number2;
      System.out.println("Result is - " + result);
    } else if (operation == 2) {
      int result = number1 - number2;
      System.out.println("Result is - " + result);
    } else if (operation == 3) {
      double result = (double) number1 / number2;
      System.out.println("Result is - " + result);
    } else if (operation == 4) {
      int result = number1 * number2;
      System.out.println("Result is - " + result);
    } else {
      System.out.println("Unsupported Operation!");
    }

    scanner.close();
  }
}
