package com.marto.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author marto
 */
public class Student {

  String name;
  ArrayList<Integer> marks = new ArrayList<Integer>();

  public Student(String name, int... marks) {
    this.name = name;
    for (int mark : marks) {
      this.marks.add(mark);
    }
  }

  public int getNumberOfMarks() {
    return this.marks.size();
  }

  public int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    return sum;
  }

  public int getMaximumMark() {
    return Collections.max(marks);
  }

  public int getMinimumMark() {
    return Collections.min(marks);
  }

  public BigDecimal getAverageMarks() {
    int sumOfMarks = getTotalSumOfMarks();
    BigDecimal sum = new BigDecimal(sumOfMarks);
    int numberOfMarks = getNumberOfMarks();
    BigDecimal number = new BigDecimal(numberOfMarks);

    return sum.divide(number, 3, RoundingMode.HALF_UP);
  }

  public String toString() {
    return name + marks;
  }
}
