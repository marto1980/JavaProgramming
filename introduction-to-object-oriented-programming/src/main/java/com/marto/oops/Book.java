package com.marto.oops;

/**
 * @author marto
 */
public class Book {
  private int noOfCopies;

  public int getNoOfCopies() {
    return noOfCopies;
  }

  public void setNoOfCopies(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  public void increaseNoOfCopies(int increment) {
    noOfCopies += increment;
  }

  public void decreaseNoOfCopies(int decrement) {
    noOfCopies -= decrement;
  }
}
