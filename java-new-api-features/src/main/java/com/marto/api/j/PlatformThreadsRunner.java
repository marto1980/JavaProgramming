package com.marto.api.j;

public class PlatformThreadsRunner {

  public static void main(String[] args) {
    for (int i = 0; i < 1000000; i++) {
      System.out.println(i);
      new Thread(new SleepingThread()).start();
    }
  }
}
