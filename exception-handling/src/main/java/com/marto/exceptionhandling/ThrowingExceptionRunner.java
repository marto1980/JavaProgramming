package com.marto.exceptionhandling;

public class ThrowingExceptionRunner {

  public static void main(String[] args) throws CurrenciesDoNotMatchException {
    Amount amount1 = new Amount("USD", 10);
    Amount amount2 = new Amount("EUR", 20);
    amount1.add(amount2);

    System.out.println(amount1);
  }
}
