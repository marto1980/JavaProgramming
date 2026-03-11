package com.marto.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

  public static void main(String[] args) {
    String str = "This is an awesome occasion. This has never happened before.";

    Map<Character, Integer> occurrences = new HashMap<>();
    char[] characters = str.toCharArray();

    for (Character ch : characters) {
      Integer count = occurrences.get(ch);
      if (count == null) {
        occurrences.put(ch, 1);
      } else {
        occurrences.put(ch, count + 1);
      }
    }

    System.out.println("occurrences: " + occurrences);

    String[] words = str.split("[ .]");

    Map<String, Integer> wordmap = new HashMap<>();

    for (String word : words) {
      Integer count = wordmap.get(word);
      if (count == null) {
        wordmap.put(word, 1);
      } else {
        wordmap.put(word, count + 1);
      }
    }

    System.out.println("wordmap: " + wordmap);
  }
}
