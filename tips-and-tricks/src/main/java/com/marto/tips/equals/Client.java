package com.marto.tips.equals;

public class Client {
  private int id;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  @Override
  public boolean equals(Object that) {
    if (this == that) return true;
    if (that == null) return false;
    if (getClass() != that.getClass()) return false;
    Client other = (Client) that;
    if (id != other.id) return false;
    return true;
  }

  public Client(int id) {
    this.id = id;
  }
}
