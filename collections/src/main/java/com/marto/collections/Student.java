package com.marto.collections;

/** Hello world! */
public class Student implements Comparable<Student> {
  private String name;
  private int id;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return id + " " + name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int compareTo(Student that) {
    return Integer.compare(this.id, that.id);
  }
}
