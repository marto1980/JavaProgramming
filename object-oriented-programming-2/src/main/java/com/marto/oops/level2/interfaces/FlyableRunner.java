package com.marto.oops.level2.interfaces;

/**
 * @author marto
 */
public class FlyableRunner {

  public static void main(String[] args) {
    Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
    for (Flyable flyable : flyingObjects) {
      flyable.fly();
    }
  }
}
