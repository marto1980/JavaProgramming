package com.marto.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {
  public static void print(Integer number) {
    System.out.println(number);
  }

  public static boolean isEven(Integer n) {
    return n % 2 == 0;
  }

  private static Predicate<? super Integer> createOddPredicate() {
    return n -> n % 2 == 1;
  }

  public static void main(String[] args) {
    List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
        .map(s -> s.length())
        .forEach(n -> System.out.println(n));
    List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
        .map(String::length)
        // .forEach(System.out::println);
        .forEach(MethodReferencesRunner::print);

    Predicate<? super Integer> isEven = n -> n % 2 == 0;
    Predicate<? super Integer> isOdd = createOddPredicate();
    Integer max = List.of(23, 45, 67, 34).stream().filter(isEven).max(Integer::compare).orElse(0);

    System.out.println(max);
  }
}
