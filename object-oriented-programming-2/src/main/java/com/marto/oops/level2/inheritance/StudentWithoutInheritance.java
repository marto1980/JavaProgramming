package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class StudentWithoutInheritance {

  private String Name;
  private String email;
  private String phoneNumber;

  private String collegeName;
  private int year;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
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

  public String getCollegeName() {
    return collegeName;
  }

  public void setCollegeName(String college) {
    this.collegeName = college;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
