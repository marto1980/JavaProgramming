package com.marto.oops.level2;

/**
 * @author marto
 */
public abstract class AbstractRecipe {
  public void execute() {
    getReady();
    doTheDish();
    cleanup();
  }

  abstract void getReady();

  abstract void doTheDish();

  abstract void cleanup();
}
