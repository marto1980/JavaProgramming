package com.marto.learn_spring_framework;

import com.marto.learn_spring_framework.game.GameRunner;
import com.marto.learn_spring_framework.game.PacManGame;

public class AppGamingBasicJava {

  public static void main(String[] args) {
    // var game = new MarioGame();
    // var game = new SuperContraGame();
    var game = new PacManGame();
    var gameRunner = new GameRunner(game);
    gameRunner.run();
  }
}
