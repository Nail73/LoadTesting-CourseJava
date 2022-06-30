import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {

  Employee employee;
  int fixSalary = 30_000;

  public int getFixSalary() {
    return fixSalary;
  }

  int income = (int) (10_000_000 + (Math.round(Math.random() * 10_000_000)));
  private final List<Employee> listEmployees = new ArrayList<>();

  public void hire(Employee employee) {
    employee.setCompany(this);
    listEmployees.add(employee);
  }

  public void hireAll(List<Employee> employee) {
    for (Employee e : employee) {
      hire(e);
    }
  }

  public void fire(Employee employee) {
    employee.setCompany(null);
    listEmployees.remove(employee);
  }

  public int getIncome() {
    return income;
  }

  public List<Employee> getTopSalaryStaff(int count) {
    return getList(count, Comparator.reverseOrder());
  }

  public List<Employee> getLowestSalaryStaff(int count) {
    return getList(count, Comparator.naturalOrder());
  }

  private List<Employee> getList(int count, Comparator<Employee> comparator) {
    if (count < 0) {
      return Collections.emptyList();
    }
    if (count < listEmployees.size()) {
      count = count;
    }
    listEmployees.sort(comparator);
    return new ArrayList<>(listEmployees.subList(0, count));
  }

  public List<Employee> getEmployees() {
    return new ArrayList<>(listEmployees);
  }
}


