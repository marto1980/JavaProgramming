package com.marto.api.l;

public class PatternMatchingRunner {

  public static void main(String[] args) {
    // instanceofOld();
    instanceofNew();
  }

  private static void instanceofNew() {
    Object objStr = "Some String";
    if (objStr instanceof String str) {
      System.out.println(str.toLowerCase());
    }
  }

  private static void instanceofOld() {
    Object objStr = "Some String";
    if (objStr instanceof String) {
      String str = (String) objStr;
      System.out.println(str.toLowerCase());
    }
  }
}
