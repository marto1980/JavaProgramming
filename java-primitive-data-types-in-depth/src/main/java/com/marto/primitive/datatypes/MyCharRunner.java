package com.marto.primitive.datatypes;

/**
 * @author marto
 */
public class MyCharRunner {

  public static void main(String[] args) {
    MyChar myChar = new MyChar('i');
    System.out.println(myChar.isVowel()); // 'a', 'e', 'i', 'o', 'u' and Capitals
    System.out.println(myChar.isConsonant());
    System.out.println(myChar.isDigit());
    System.out.println(myChar.isAlphabet());
    MyChar.printLowerCaseAlphabets();
    MyChar.printUpperCaseAlphabets();
  }
}
