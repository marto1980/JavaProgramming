package com.marto.tips.equals;

public class EqualsRunner {

  public static void main(String[] args) {
    Client c1 = new Client(1);
    Client c2 = new Client(1);
    Client c3 = new Client(2);
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
  }
}
