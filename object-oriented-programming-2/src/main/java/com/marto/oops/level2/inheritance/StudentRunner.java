package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class StudentRunner {

  public static void main(String[] args) {
    // Student student = new Student();
    // student.setName("Ranga");
    // student.setEmail("in28minutes.gmail.com");

    Person person = new Person();
    String value = person.toString();
    System.out.println(value);
    System.out.println(person);
  }
}
