package com.marto.primitive.datatypes;

public class MyChar {

  private char ch;

  public MyChar(char ch) {
    this.ch = ch;
  }

  public boolean isVowel() {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
        || ch == 'I' || ch == 'O' || ch == 'U') {
      return true;
    }
    return false;
  }

  public boolean isDigit() {
    return ch >= '0' && ch <= '9';
  }

  public boolean isAlphabet() {
    boolean isLowerCaseAlphabet = ch >= 'a' && ch <= 'z';
    boolean isUpperCaseAlphabet = ch >= 'A' && ch <= 'Z';

    return isLowerCaseAlphabet || isUpperCaseAlphabet;
  }

  public static void printLowerCaseAlphabets() {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      System.out.println(ch);
    }
  }

  public static void printUpperCaseAlphabets() {
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.println(ch);
    }
  }

  public boolean isConsonant() {
    return isAlphabet() && !isVowel();
  }
}
