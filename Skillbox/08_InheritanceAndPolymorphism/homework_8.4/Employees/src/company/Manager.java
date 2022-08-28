package company;

public class Manager extends Worker {

  public static final double DELTA_M = 0.05;

  public Manager(int salary) {
    super(salary);
    setCompany(company);
  }

  @Override
  public int getMonthSalary() {
    return (int) (salary + DELTA_M * sales);
  }
}
