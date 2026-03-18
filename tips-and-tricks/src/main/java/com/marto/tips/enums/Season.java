package com.marto.tips.enums;

public enum Season {
  FALL(4),
  WINTER(1),
  SUMMER(3),
  SPRING(2);

  private int value;

  private Season(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
