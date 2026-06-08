package com.marto.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class MyMathTest {

  private MyMath myMath = new MyMath();

  @Test
  public void calculateSum_emptyArray() {
    int result = myMath.calculateSum(new int[] {});
    assertEquals(0, result);
  }

  /** Rigorous Test :-) */
  @Test
  public void calculateSum_threeElements() {
    int result = myMath.calculateSum(new int[] {1, 2, 3});
    assertEquals(6, result);
  }
}
