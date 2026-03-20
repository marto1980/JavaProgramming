package com.marto.api.l;

public class PatternMatchingRunner {

  record Transaction(String sender, String receiver, int amount) {}

  private static void printTransactionOld(Object objTransaction) {
    if (objTransaction instanceof Transaction transaction) {
      String sender = transaction.sender();
      String receiver = transaction.receiver();
      int amount = transaction.amount();

      System.out.println(sender + " " + receiver + " " + amount);
    }
  }

  private static void printTransactionNew(Object objTransaction) {
    if (objTransaction instanceof Transaction(String sender, String receiver, int amount)) {

      System.out.println(sender + " " + receiver + " " + amount);
    }
  }

  public static void main(String[] args) {
    // instanceofOld();
    // instanceofNew();
    printTransactionNew(new Transaction("You", "Me", 1_000_000));
  }

  private static void instanceofNew() {
    Object objStr = "Some String";
    if (objStr instanceof String str) {
      System.out.println(str.toLowerCase());
    }
  }

  private static void instanceofOld() {
    Object objStr = "Some String";
    if (objStr instanceof String) {
      String str = (String) objStr;
      System.out.println(str.toLowerCase());
    }
  }
}
