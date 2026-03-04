package com.marto.ifstatement.examples;

/**
 * @author marto
 */
public class SwitchStatementRunner {

  public static void main(String[] args) {
    // puzzle1();
    // puzzle2();
    // puzzle3();
    // puzzle4();
    // puzzle5();
    // puzzle6();
    // isWeekDay(0);
    // System.out.println(determineNameOfDay(0));
    System.out.println(isWeekDay(5));
  }

  private static boolean isWeekDay(int dayNumber) {
    switch (dayNumber) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        return true;
    }
    return false;
  }

  private static String determineNameOfMonth(int monthNumber) {
    switch (monthNumber) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Inavlid Month Number";
    }
  }

  private static String determineNameOfDay(int dayNumber) {
    String result = "";
    switch (dayNumber) {
      case 0:
        result = "Monday";
        break;
      case 1:
        result = "Tuesday";
        break;
      case 2:
        result = "Wednesday";
        break;
      case 3:
        result = "Thursday";
        break;
      case 4:
        result = "Friday";
        break;
      case 5:
        result = "Saturday";
        break;
      case 6:
        result = "Sunday";
        break;
      default:
        result = "Invalid day number";
        break;
    }

    return result;
  }

  private static void puzzle6() {
    int number = 10;
    int i = number * 2;
    switch (number) {
        // case number > 5:
        // System.out.println("number > 5");
    }
  }

  private static void puzzle5() {
    long l = 15;
    // switch (l) {
    // }
  }

  private static void puzzle4() {
    int number = 10;
    switch (number) {
      default:
        System.out.println("Default");
        break;
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
    }
  }

  private static void puzzle3() {
    int number = 10;
    switch (number) {
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
      default:
        System.out.println("Default");
        break;
    }
  }

  private static void puzzle1() {
    int number = 2;
    switch (number) {
      case 1:
        System.out.println(1);
      case 2:
        System.out.println(2);
      case 3:
        System.out.println(3);
      default:
        System.out.println("Default");
    }
  }

  private static void puzzle2() {
    int number = 2;
    switch (number) {
      case 1:
        System.out.println(1);
        break;
      case 2:
      case 3:
        System.out.println("Number is 2 or 3");
        break;
      default:
        System.out.println("Default");
        break;
    }
  }
}
