package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class Student extends Person {
  private String collegeName;

  public String getCollegeName() {
    return collegeName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  private int year;
}
