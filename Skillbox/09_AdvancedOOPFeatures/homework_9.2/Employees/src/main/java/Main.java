import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

  private static final String STAFF_TXT = "data/staff.txt";

  public static void main(String[] args) {

    List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
    Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
    System.out.println(employeeMaxSalary);
  }

  public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {

    return staff.stream()
        .filter(e -> e.getWorkStart().toInstant().atZone(ZoneId.systemDefault()).getYear() == year)
        .max(Comparator.comparing(Employee::getSalary))
        .orElseThrow(NoSuchElementException::new);
  }
}