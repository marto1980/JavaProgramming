package com.marto.oops.level2.interfaces;

/**
 * @author marto
 */
public class GameRunner {

  public static void main(String[] args) {
    // GamingConsole game = new MarioGame();
    ChessGame game = new ChessGame();
    game.up();
    game.down();
    game.left();
    game.right();
  }
}
