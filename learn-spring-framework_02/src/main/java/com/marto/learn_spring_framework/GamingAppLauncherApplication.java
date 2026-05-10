package com.marto.learn_spring_framework;

import com.marto.learn_spring_framework.game.GameRunner;
import com.marto.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.marto.learn_spring_framework.game")
public class GamingAppLauncherApplication {

  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
      context.getBean(GamingConsole.class).up();

      context.getBean(GameRunner.class).run();
    }
  }
}
