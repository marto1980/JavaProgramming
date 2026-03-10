package com.marto.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author marto
 */
public class StudentCollectionRunner {

  public static void main(String[] args) {
    List<Student> students =
        List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));

    List<Student> studentsAl = new ArrayList<>(students);
    System.out.println(studentsAl);

    Collections.sort(studentsAl);
    System.out.println(studentsAl);
  }
}
