package com.marto.restapi.course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
  @Id @GeneratedValue private Long id;

  private String name;

  private String author;

  public Course() {}

  public Course(Long id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
