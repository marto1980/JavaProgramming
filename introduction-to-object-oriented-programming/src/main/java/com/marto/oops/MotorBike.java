package com.marto.oops;

public class MotorBike {
  private int speed;

  MotorBike(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if (speed > 0) {
      this.speed = speed;
    }
  }

  public void increaseSpeed(int increment) {
    setSpeed(speed + increment);
  }

  public void decreaseSpeed(int decrement) {
    setSpeed(speed - decrement);
  }

  void start() {
    System.out.println("Bike Started");
  }
}
