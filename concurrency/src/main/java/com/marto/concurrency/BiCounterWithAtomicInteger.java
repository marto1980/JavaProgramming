package com.marto.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

  private AtomicInteger i = new AtomicInteger(0);
  private AtomicInteger j = new AtomicInteger(0);

  public int getJ() {
    return i.get();
  }

  public void setJ(AtomicInteger j) {
    this.j = j;
  }

  public int getI() {
    return i.get();
  }

  public void setI(AtomicInteger i) {
    this.i = i;
  }

  public void incrementI() {
    i.incrementAndGet();
  }

  public void incrementJ() {
    j.incrementAndGet();
  }
}
