package com.marto.api.k;

import java.util.ArrayList;
import java.util.List;

public class SequencedListRunner {

  public static void main(String[] args) {
    ArrayList<String> courseDetails = new ArrayList<>();
    courseDetails.add("Spring Security");

    courseDetails.addFirst("Spring Boot");
    courseDetails.addLast("Spring Boot in AI");

    courseDetails.add("Cloud Computing with AWS");
    courseDetails.add("Cloud Computing with Azure");

    System.out.println("Remove first element:: " + courseDetails.removeFirst());
    System.out.println("Remove last element:: " + courseDetails.removeLast());

    System.out.println("List:: " + courseDetails);
    System.out.println("First element:: " + courseDetails.getFirst());
    System.out.println("Last element:: " + courseDetails.getLast());

    List<String> reverseCourseDetails = courseDetails.reversed();
    System.out.println("ReversedList:: " + reverseCourseDetails);
  }
}
