package com.marto.exceptionhandling;

public class CurrenciesDoNotMatchException extends Exception {
  public CurrenciesDoNotMatchException(String msg) {
    super(msg);
  }
}
