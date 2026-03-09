package com.marto.oops.level2.inheritance;

/**
 * @author marto
 */
public class StudentRunner {

  public static void main(String[] args) {
    // Student student = new Student();
    // student.setName("Ranga");
    // student.setEmail("in28minutes.gmail.com");

    // Person person = new Person();
    // person.setName("Ranga");
    // person.setEmail("ranga@int28minutes.com");
    // person.setPhoneNumber("123-456-7890");
    //
    // String value = person.toString();
    // System.out.println(value);
    // System.out.println(person);
    Employee employee = new Employee();
    employee.setName("Ranga");
    employee.setEmail("ranga@int28minutes.com");
    employee.setPhoneNumber("123-456-7890");
    employee.setTitle("Dr.");
    employee.setEmployer("IBM");
    employee.setEmployeeGrade("II");
    employee.setSalary("100000 €");

    System.out.println(employee);
  }
}
