package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class AnimalRunner {

  public static void main(String[] args) {
    Animal[] animals = {new Cat(), new Dog()};
    for (Animal animal : animals) {
      animal.bark();
    }
  }
}
