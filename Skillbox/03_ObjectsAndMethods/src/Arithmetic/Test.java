package Arithmetic;

public class Test {

  public static void main(String[] args) {
    Arithmetic arithmetic = new Arithmetic(15, 39);
    String result = arithmetic.sum() + "\n" +
        arithmetic.average() + "\n" +
        arithmetic.max();

    System.out.println(result);
  }

}
