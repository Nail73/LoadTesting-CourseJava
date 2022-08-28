package company;

public abstract class Worker implements Employee {

  protected int salary;
  protected int sales = (int) (Math.random() * (140000 - 115000) + 115000);
  protected Company company;

  public Worker(int salary) {
    this.salary = (int) (Math.random() * salary) + salary;
  }

  @Override
  public int getMonthSalary() {
    return salary;
  }

  @Override
  public void setCompany(Company company) {
    this.company = company;
  }

  public int getSales() {
    return sales;
  }
}
