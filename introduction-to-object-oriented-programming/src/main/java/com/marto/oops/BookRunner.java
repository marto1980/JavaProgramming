package com.marto.oops;

/**
 * @author marto
 */
public class BookRunner {

  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book(1000);
    Book effectiveJava = new Book(100);
    Book cleanCode = new Book(10);

    artOfComputerProgramming.setNoOfCopies(100);
    effectiveJava.setNoOfCopies(50);
    cleanCode.setNoOfCopies(45);
  }
}
