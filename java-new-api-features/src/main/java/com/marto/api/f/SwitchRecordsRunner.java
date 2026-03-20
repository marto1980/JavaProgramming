package com.marto.api.f;

public class SwitchRecordsRunner {

  interface CustomerMessage {}

  record Message(String text) implements CustomerMessage {}

  record Feedback(int rating, String description) implements CustomerMessage {}

  public static void main(String[] args) {
    // CustomerMessage customerMessage = new Message("Hello");
    CustomerMessage customerMessage = new Feedback(5, "Really good!");
    String response =
        switch (customerMessage) {
          case Message message -> message.text();
          case Feedback feedback -> feedback.description();
          default -> "Default value";
        };
    System.out.println(response);
  }
}
