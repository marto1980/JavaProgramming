package com.marto.arrays;

/**
 * @author marto
 */
public class DaysOfWeek {

  String[] daysOfTheWeek = {
    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
  };

  String findLongestString() {
    String longestDayOfWeek = "";
    for (String weekDay : daysOfTheWeek) {
      if (longestDayOfWeek.length() < weekDay.length()) {
        longestDayOfWeek = weekDay;
      }
    }
    return longestDayOfWeek;
  }

  String[] reverseArray() {
    String[] reversedArray = new String[daysOfTheWeek.length];
    for (int i = daysOfTheWeek.length - 1; i >= 0; i--) {
      reversedArray[daysOfTheWeek.length - i - 1] = daysOfTheWeek[i];
    }
    return reversedArray;
  }
}
