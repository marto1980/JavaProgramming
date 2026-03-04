package com.marto.loops;

/**
 * @author marto
 */
public class MyNumber {
  int number;

  public MyNumber(int i) {
    this.number = i;
  }

  public boolean isPrime() {
    if (number < 2) {
      return false;
    }

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  public int sumUpToN() {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }

    return sum;
  }

  public int sumOfDivisors() {
    int sum = 1;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }

    return sum;
  }

  public void printANumberTriangle() {

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
