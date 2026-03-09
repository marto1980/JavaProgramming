package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class Employee extends Person {
  private String title;
  private String employer;
  private String employeeGrade;
  private String salary;

  public String toString() {
    return super.toString()
        + ", "
        + String.format(
            "Title: %s, Employer: %s, employeeGrade: %s, Salary:" + " %s",
            title, employer, employeeGrade, salary);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public String getEmployeeGrade() {
    return employeeGrade;
  }

  public void setEmployeeGrade(String employerGrade) {
    this.employeeGrade = employerGrade;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }
}
