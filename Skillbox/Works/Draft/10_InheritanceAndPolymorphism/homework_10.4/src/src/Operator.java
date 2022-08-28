public class Operator extends Company implements Employee {

  public Operator(int i) {
    super();
  }

  @Override
  public int getMonthSalary() {
    return fixSalary;
  }
}
