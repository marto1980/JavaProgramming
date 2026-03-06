package com.marto.oops.level2;

public class FanRunner {
  public static void main(String[] args) {
    Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
    System.out.println(fan);

    fan.switchOn();
    System.out.println(fan);

    fan.switchOff();
    System.out.println(fan);
  }
}
