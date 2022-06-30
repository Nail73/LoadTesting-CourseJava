import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    int result = o1.getSalary() - o2.getSalary();
    if (result != 0) {
      return result;
    } else {
      return o1.getName().compareTo(o2.getName());
    }
  }
}


