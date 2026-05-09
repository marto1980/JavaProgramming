package com.marto.learn_spring_framework;

import com.marto.learn_spring_framework.game.GameRunner;
import com.marto.learn_spring_framework.game.MarioGame;

public class AppGamingBasicJava {

  public static void main(String[] args) {
    var game = new MarioGame();
    // var game = new SuperContraGame();
    var gameRunner = new GameRunner(game);
    gameRunner.run();
  }
}
