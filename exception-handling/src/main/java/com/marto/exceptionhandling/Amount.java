package com.marto.exceptionhandling;

public class Amount {

  private String currency;
  private int amount;

  public Amount(String currency, int amount) {
    this.currency = currency;
    this.amount = amount;
  }

  public void add(Amount that) {
    if (!this.currency.equals(that.currency)) {
      throw new RuntimeException("Currencies Don't Match");
    }

    this.amount = this.amount + that.amount;
  }

  public String toString() {
    return amount + " " + currency;
  }
}
