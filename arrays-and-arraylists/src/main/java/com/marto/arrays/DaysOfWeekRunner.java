package com.marto.arrays;

import java.util.Arrays;

/**
 * @author marto
 */
public class DaysOfWeekRunner {

  public static void main(String[] args) {
    DaysOfWeek daysOfWeek = new DaysOfWeek();
    System.out.println("Longest string: " + daysOfWeek.findLongestString());
    System.out.println("Days of week backwards: " + Arrays.toString(daysOfWeek.reverseArray()));
  }
}
