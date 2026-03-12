package com.marto.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
  static <X> X doubleValue(X value) {
    return value;
  }

  static <X extends List> void duplicate(X list) {
    list.addAll(list);
  }

  public static void main(String[] args) {
    String value1 = doubleValue(new String());
    Integer number1 = doubleValue(Integer.valueOf(5));
    List list1 = doubleValue(new ArrayList<>());

    ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
    duplicate(numbers);
    System.out.println(numbers);

    MyCustomList<Long> list = new MyCustomList<>();
    list.addElement(5l);
    list.addElement(7l);
    Long value = list.get(0);

    System.out.println(list);
    System.out.println(value);

    MyCustomList<Integer> list2 = new MyCustomList<>();
    list2.addElement(Integer.valueOf(5));
    list2.addElement(Integer.valueOf(7));

    Integer number = list2.get(0);
    System.out.println(list2);
    System.out.println(number);
  }
}
