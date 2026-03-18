package com.marto.tips.nonaccess.package1;

class Player {
  private String name;
  private static int count;

  public Player(String name) {
    this.name = name;
    count++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static int getCount() {
    return count;
  }

  public static void setCount(int count) {
    Player.count = count;
  }
}

public class StaticModifierRunner {

  public static void main(String[] args) {
    Player player1 = new Player("Ronaldo");
    System.out.println(Player.getCount());

    Player player2 = new Player("Federer");
    System.out.println(Player.getCount());
  }
}
