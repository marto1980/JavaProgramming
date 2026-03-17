package com.marto.concurrency;

public class BiCounter {

  private int i = 0;
  private int j = 0;

  public int getJ() {
    return j;
  }

  public void setJ(int j) {
    this.j = j;
  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public synchronized void incrementI() {
    i++;
  }

  public synchronized void incrementJ() {
    j++;
  }
}
