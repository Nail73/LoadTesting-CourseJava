package Arithmetic;

public class Arithmetic {

  private int x;
  private int y;

  public Arithmetic(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return x + y;
  }

  public int diff() {
    return x - y;
  }

  public int multi() {
    return x * y;
  }

  public int average() {
    return (x + y) / 2;
  }

  public int max() {
    return Math.max(x, y);
  }

  public int min() {
    return Math.min(x, y);
  }
}
