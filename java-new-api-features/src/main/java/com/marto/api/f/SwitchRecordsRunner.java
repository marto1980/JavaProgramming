package com.marto.api.f;

public class SwitchRecordsRunner {

  sealed interface CustomerMessage permits Message, Feedback {}

  record Message(String text) implements CustomerMessage {}

  record Feedback(int rating, String description) implements CustomerMessage {}

  record SupportRequest(String user, CustomerMessage message) {}

  public static void main(String[] args) {
    CustomerMessage customerMessage = new Message("Hello");
    // CustomerMessage customerMessage = new Feedback(5, "Really good!");
    String response =
        switch (customerMessage) {
          case Message(String text) -> text;
          case Feedback(int rating, String description) -> description;
        };
    System.out.println(response);

    SupportRequest request = new SupportRequest("Rahul", new Feedback(5, "Really good!"));

    String responseMessage =
        switch (request) {
          case SupportRequest(String user, Message(String text)) -> text;
          case SupportRequest(String user, Feedback(int rating, String description)) -> description;
        };
    System.out.println(responseMessage);
  }
}
