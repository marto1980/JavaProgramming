package com.marto.api.j;

import java.util.concurrent.TimeUnit;

class SleepingThread implements Runnable {

  @Override
  public void run() {
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

public class PlatformThreadsRunner {

  public static void main(String[] args) {
    for (int i = 0; i < 1000000; i++) {
      System.out.println(i);
      new Thread(new SleepingThread()).start();
    }
  }
}
