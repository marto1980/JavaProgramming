package com.marto.oops;

/**
 * @author marto
 */
public class MotorBikeRunner {

  public static void main(String[] args) {
    MotorBike ducati = new MotorBike();
    MotorBike honda = new MotorBike();

    ducati.start();
    honda.start();

    ducati.setSpeed(100);

    int ducatiSpeed = ducati.getSpeed();
    ducatiSpeed += 100;
    ducati.setSpeed(ducatiSpeed);

    int hondaSpeed = honda.getSpeed();
    hondaSpeed += 100;
    honda.setSpeed(hondaSpeed);

    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());
  }
}
