package com.marto.api.i;

public class SealedInterfacesRunner {
  sealed interface Flyable permits Bird, Aeroplane, Helicopter, BirdInterface {}

  sealed interface BirdInterface extends Flyable permits Bla {}

  non-sealed interface Bla extends BirdInterface {}

  final class Bird implements Flyable {}

  sealed class Aeroplane implements Flyable permits Boeing {}

  final class Boeing extends Aeroplane {}

  non-sealed class Helicopter implements Flyable {}

  public static void main(String[] args) {}
}
