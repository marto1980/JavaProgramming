package com.marto.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author marto
 */
public class Student {

  String name;
  int[] marks;

  public Student(String name, int[] marks) {
    this.name = name;
    this.marks = marks;
  }

  public int getNumberOfMarks() {
    return this.marks.length;
  }

  public int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    return sum;
  }

  public int getMaximumMark() {
    int max = Integer.MIN_VALUE;
    for (int mark : marks) {
      if (mark > max) {
        max = mark;
      }
    }
    return max;
  }

  public int getMinimumMark() {
    int min = Integer.MAX_VALUE;
    for (int mark : marks) {
      if (mark < min) {
        min = mark;
      }
    }
    return min;
  }

  public BigDecimal getAverageMarks() {
    int sumOfMarks = getTotalSumOfMarks();
    BigDecimal sum = new BigDecimal(Integer.valueOf(sumOfMarks).toString());
    int numberOfMarks = getNumberOfMarks();
    BigDecimal number = new BigDecimal(Integer.valueOf(numberOfMarks).toString());

    return sum.divide(number, 3, RoundingMode.HALF_UP);
  }
}
