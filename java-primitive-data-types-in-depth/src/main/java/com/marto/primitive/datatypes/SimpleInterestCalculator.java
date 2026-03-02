package com.marto.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

  BigDecimal principal;
  BigDecimal interest;

  public SimpleInterestCalculator(String principal, String interest) {
    this.principal = new BigDecimal(principal);
    BigDecimal interestInPercent = new BigDecimal(interest);
    this.interest = interestInPercent.divide(new BigDecimal(100));
  }

  public BigDecimal calculateTotalValue(int noOfYears) {
    return principal.add(principal.multiply(interest.multiply(new BigDecimal(noOfYears))));
  }
}
