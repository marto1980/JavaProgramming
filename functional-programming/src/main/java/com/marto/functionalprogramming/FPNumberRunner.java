package com.marto.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
    int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
    System.out.println("Sum of all: " + sum);

    int sumOfOdds =
        numbers.stream()
            .reduce(0, (number1, number2) -> number1 + (number2 % 2 == 1 ? number2 : 0));
    System.out.println("Sum of odds: " + sumOfOdds);
  }
}
