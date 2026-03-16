package com.marto.exceptionhandling;

public class Amount {

  private String currency;
  private int amount;

  public Amount(String currency, int amount) {
    this.currency = currency;
    this.amount = amount;
  }

  public void add(Amount that) throws CurrenciesDoNotMatchException {
    if (!this.currency.equals(that.currency)) {
      // throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
      throw new CurrenciesDoNotMatchException(
          "Currencies Don't Match " + this.currency + " & " + that.currency);
    }

    this.amount = this.amount + that.amount;
  }

  public String toString() {
    return amount + " " + currency;
  }
}
