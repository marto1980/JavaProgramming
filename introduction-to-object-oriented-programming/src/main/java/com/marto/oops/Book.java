package com.marto.oops;

/**
 * @author marto
 */
public class Book {
  private int noOfCopies;

  Book(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  public int getNoOfCopies() {
    return noOfCopies;
  }

  public void setNoOfCopies(int noOfCopies) {
    if (noOfCopies > 0) this.noOfCopies = noOfCopies;
  }

  public void increaseNoOfCopies(int increment) {
    setNoOfCopies(noOfCopies + increment);
  }

  public void decreaseNoOfCopies(int decrement) {
    setNoOfCopies(noOfCopies - decrement);
  }
}
