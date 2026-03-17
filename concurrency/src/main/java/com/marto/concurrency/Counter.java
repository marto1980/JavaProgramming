package com.marto.concurrency;

public class Counter {

  int i = 0;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public void increment() {
    i++;
  }
}
