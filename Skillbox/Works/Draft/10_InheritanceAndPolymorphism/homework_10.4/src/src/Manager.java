public class Manager extends Company implements Employee {

  int earnedMoney = (int) (Math.round(115_000 + (Math.random() * 25_000)));
  double salaryPercentManager = 0.05;

  public Manager(int i) {
    super();
  }

  @Override
  public int getMonthSalary() {
    return fixSalary + ((int) (earnedMoney * salaryPercentManager));
  }
}
