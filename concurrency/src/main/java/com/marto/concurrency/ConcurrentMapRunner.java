package com.marto.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

  public static void main(String[] args) {
    String str = "ABCD ABCD ABCD";
    ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();
    for (char character : str.toCharArray()) {
      occurrences.computeIfAbsent(character, ch -> new LongAdder()).increment();
    }

    System.out.println(occurrences);
  }
}
