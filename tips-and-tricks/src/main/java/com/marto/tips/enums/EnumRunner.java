package com.marto.tips.enums;

import java.util.Arrays;

public class EnumRunner {

  public static void main(String[] args) {
    Season season = Season.WINTER;

    Season season1 = Season.valueOf("FALL");
    System.out.println(season1);
    System.out.println(season1.ordinal());
    System.out.println(Season.SPRING.ordinal());
    System.out.println(Season.SPRING.getValue());
    System.out.println(Arrays.toString(Season.values()));
  }
}
