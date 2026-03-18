package com.marto.tips.blocks;

public class BlocksRunner {
  public static final int SECONDS_IN_MINUTE = 60;
  public static final int MINITES_IN_HOUR = 60;
  public static final int HOURS_IN_DAY = 24;

  public static void main(String[] args) {
    System.out.println(Integer.MIN_VALUE);
    System.out.println(SECONDS_IN_MINUTE * MINITES_IN_HOUR * HOURS_IN_DAY);
    if (3 > 2) {
      // System.out.println("3 > 2");
    }
  }
}
