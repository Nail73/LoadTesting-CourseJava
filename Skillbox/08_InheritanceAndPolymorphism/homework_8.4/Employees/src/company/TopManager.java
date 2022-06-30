package company;

public class TopManager extends Worker {

  public static final int MIN_INCOME = 10_000_000;
  public static final double DELTA_TOP = 1.5;

  public TopManager(int salary) {
    super(salary);
    setCompany(company);
  }

  @Override
  public int getMonthSalary() {
    if (company.getIncome() > MIN_INCOME) {
      return (int) (salary + salary * DELTA_TOP);
    }
    return salary;
  }
}

