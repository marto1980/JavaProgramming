package com.marto.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRunner {

  public static void main(String[] args) {
    String str = "This is an awesome occasion. This has never happened before.";

    Set<Character> charset = new HashSet<>();
    for (Character character : str.toCharArray()) {
      charset.add(character);
    }

    Map<Character, Integer> charmap = new HashMap<>();
    for (Character character : charset) {
      int count = 0;
      for (Character ch : str.toCharArray()) {
        if (ch == character) {
          count++;
        }
      }
      charmap.put(character, count);
    }

    System.out.println("charset: " + charset);
    System.out.println("charmap: " + charmap);

    Set<String> wordset = new HashSet<>();
    String[] wordArray = str.split("[ .]");
    for (String word : wordArray) {
      wordset.add(word);
    }

    Map<String, Integer> wordmap = new HashMap<>();

    for (String word : wordset) {
      int count = 0;
      for (String worda : wordArray) {
        if (word.equals(worda)) {
          count++;
        }
      }
      wordmap.put(word, count);
    }
    System.out.println("wordset: " + wordset);
    System.out.println("wordmap: " + wordmap);
  }
}
