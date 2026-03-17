package com.marto.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

  private int i = 0;
  private int j = 0;

  private Lock lockForI = new ReentrantLock();
  private Lock lockForJ = new ReentrantLock();

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

  public void incrementI() {
    lockForI.lock(); // Get Lock for i;
    i++;
    lockForI.unlock(); // Release Lock for i
  }

  public void incrementJ() {
    lockForJ.lock();
    j++;
    lockForJ.unlock();
  }
}
