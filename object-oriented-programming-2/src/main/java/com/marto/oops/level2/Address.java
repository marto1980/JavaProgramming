package com.marto.oops.level2;

public class Address {
  // state
  private String line1;
  private String city;
  private String zip;

  // creation
  public Address(String line1, String city, String zip) {
    this.line1 = line1;
    this.city = city;
    this.zip = zip;
  }

  @Override
  public String toString() {
    return line1 + " " + city + " " + zip;
  }
}
