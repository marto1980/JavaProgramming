package com.marto.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class MyMathTest {

  /** Rigorous Test :-) */
  @Test
  public void test() {
    int[] numbers = {1, 2, 3};

    MyMath myMath = new MyMath();
    int result = myMath.calculateSum(numbers);

    int expectedResult = 6;
    assertEquals(expectedResult, result);
  }
}
