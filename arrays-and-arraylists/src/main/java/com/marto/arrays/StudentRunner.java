package com.marto.arrays;

import java.math.BigDecimal;

public class StudentRunner {
  public static void main(String[] args) {
    int[] marks = {97, 98, 100};
    Student student = new Student("Ranga", marks);

    int number = student.getNumberOfMarks();
    System.out.println("Number of marks: " + number);
    int sum = student.getTotalSumOfMarks();
    System.out.println("Sum of marks: " + sum);
    int maximumMark = student.getMaximumMark();
    System.out.println("Maximum mark: " + maximumMark);
    int minimumMark = student.getMinimumMark();
    System.out.println("Minimum mark: " + minimumMark);

    BigDecimal average = student.getAverageMarks();
    System.out.println("Average mark: " + average);
  }
}
