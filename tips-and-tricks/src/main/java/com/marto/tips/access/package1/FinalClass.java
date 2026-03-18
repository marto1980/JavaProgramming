package com.marto.tips.access.package1;

final class FinalClass {}

// class SomeClass extends FinalClass {}

class SomeClass {
  public final void doSomething() {}
}

class ExtendingClass extends SomeClass {
  // public void doSomething() {}
}
