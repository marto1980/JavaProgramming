package com.marto.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

  public static void main(String[] args) {
    List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
    System.out.println(characters);

    Set<Character> treeset = new TreeSet<>(characters);
    System.out.println("treeSet: " + treeset);

    Set<Character> linkedhashset = new LinkedHashSet<>(characters);
    System.out.println("linkedHashSet: " + linkedhashset);

    Set<Character> hashset = new HashSet<>(characters);
    System.out.println("hashSet: " + hashset);
  }
}
