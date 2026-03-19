package com.marto.api.g;

public class TextBlocksRunner {

  public static void main(String[] args) {
    String str1 =
        """
        kjfkldjfkdjfkd\
        """;
    String str =
        """
        Line 1: %s
           "Line 2": %s
           Line 3
              Line 4
              Line 5
        Line 6
        """
            .formatted("Some Value", "Some other value");

    System.out.print(str);
  }
}
