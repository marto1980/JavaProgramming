package com.marto.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return number % 2 == 0;
  }
}

class PrintConsumer implements Consumer<Integer> {

  @Override
  public void accept(Integer t) {
    System.out.println(t);
  }
}

class NumberSquareMapper implements Function<Integer, Integer> {

  @Override
  public Integer apply(Integer t) {
    return t * t;
  }
}

public class LambdaBehindTheScenesRunner {

  public static void main(String[] args) {

    List.of(23, 43, 34, 45, 36, 48).stream()
        .filter(new EvenNumberPredicate())
        .map(new NumberSquareMapper())
        .forEach(new PrintConsumer());
    ;
  }
}
