package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class Person {

  private String name;
  private String email;

  public Person(String name) {
    System.out.println("Person Constructor");
    this.name = name;
  }

  private String phoneNumber;

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String toString() {
    return String.format("Name: %s, Email: %s, Phone Number: %s", name, email, phoneNumber);
  }
}
