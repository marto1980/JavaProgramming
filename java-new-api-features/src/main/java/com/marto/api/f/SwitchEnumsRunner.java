package com.marto.api.f;

import java.time.DayOfWeek;

public class SwitchEnumsRunner {

  public static void main(String[] args) {
    DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
    String str =
        switch (dayOfWeek) {
          case MONDAY -> "First Day of the Work Week";
          case TUESDAY, WEDNESDAY, THURSDAY -> "Middle of the Work Week";
          case FRIDAY -> "Last Day of the Work Week";
          default -> "Weekend";
        };
    System.out.println(str);
  }
}
