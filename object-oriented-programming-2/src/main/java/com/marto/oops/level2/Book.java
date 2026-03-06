package com.marto.oops.level2;

import java.util.ArrayList;
import java.util.List;

public class Book {
  private int id;
  private String title;
  private String author;
  private List<Review> reviews = new ArrayList<>();

  public Book(int id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }

  public void addReview(Review review) {
    reviews.add(review);
  }

  @Override
  public String toString() {
    return "Book [id="
        + id
        + ", title="
        + title
        + ", author="
        + author
        + ", reviews="
        + reviews
        + "]";
  }
}
