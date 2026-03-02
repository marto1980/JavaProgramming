package com.marto.primitive.datatypes;

/**
 * @author marto
 */
public class BiNumber {
  private int number1;
  private int number2;

  BiNumber(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public int getNumber1() {
    return number1;
  }

  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public int getNumber2() {
    return number2;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public int add() {
    return number1 + number2;
  }

  public int multiply() {
    return number1 * number2;
  }

  public void doubleValue() {
    setNumber1(number1 * 2);
    setNumber2(number2 * 2);
  }
}
