public class Main {

  public static void main(String[] args) {
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5, 6);
    System.out.println("Произведение a * b = " + arithmeticCalculator.calculate(Operation.MULTIPLY));
    System.out.println("Сложение a + b = " + arithmeticCalculator.calculate(Operation.ADD));
    System.out.println("Разность a - b = " + arithmeticCalculator.calculate(Operation.SUBTRACT));
  }
}
