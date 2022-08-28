public class ArithmeticCalculator {

  public double a;
  public double b;

  public final Operation operation;

  public ArithmeticCalculator(double a, double b, Operation operation) {
    this.a = a;
    this.b = b;
    this.operation = operation;
  }

  public Operation getOperation() {
    return operation;
  }

  public void calculate() {
    if (operation == Operation.ADD) {
      System.out.println(a + b);
    }
    if (operation == Operation.MULTIPLY){
      System.out.println(a * b);
    }
    if (operation == Operation.SUBTRACT){
      System.out.println(a - b);
    }
  }
}
