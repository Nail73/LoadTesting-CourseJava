public class TopManager extends Company implements Employee {

  double salaryPercentTopManager = 1.5;

  public TopManager(int i) {
    super();
  }

  @Override
  public int getMonthSalary() {
    if (getIncome() > 10_000_000) {
      return fixSalary + ((int) (fixSalary * salaryPercentTopManager));
    } else {
      return fixSalary;
    }
  }
}
