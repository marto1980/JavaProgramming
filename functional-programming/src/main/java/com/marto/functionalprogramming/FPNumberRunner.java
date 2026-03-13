package com.marto.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
    int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
    // System.out.println("Sum of all: " + sum);

    int sumOfOdds =
        numbers.stream()
            .reduce(0, (number1, number2) -> number1 + (number2 % 2 == 1 ? number2 : 0));
    // System.out.println("Sum of odds: " + sumOfOdds);

    IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

    List<String> list = List.of("Apple", "Ant", "Bat");

    list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

    list.stream().map(e -> e.length()).forEach(e -> System.out.println(e));
  }
}
