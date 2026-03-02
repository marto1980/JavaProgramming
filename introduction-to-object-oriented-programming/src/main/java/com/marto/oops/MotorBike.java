package com.marto.oops;

public class MotorBike {
  private int speed;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if (speed > 0) {
      this.speed = speed;
    }
  }

  public void increaseSpeed(int increment) {
    speed += increment;
  }

  public void decreaseSpeed(int decrement) {
    int newSpeed = speed - decrement;
    if (newSpeed > 0) {
      speed = newSpeed;
    }
  }

  void start() {
    System.out.println("Bike Started");
  }
}
