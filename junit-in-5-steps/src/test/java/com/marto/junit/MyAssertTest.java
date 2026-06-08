package com.marto.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MyAssertTest {

  private List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

  @Test
  void testAsserts() {
    assertEquals(true, todos.contains("AWS"));
    assertTrue(todos.contains("DevOps"));
    // assertFalse(todos.contains("DevOps"));
    assertArrayEquals(new int[] {1, 2}, new int[] {1, 2});
    // assertArrayEquals(new int[] {1, 2}, new int[] {1, 3});
    assertEquals(3, todos.size());
  }
}
