import java.util.Comparator;
import java.util.List;

public class Main {

  public static final String STAFF_TXT = "data/staff.txt";

  public static void main(String[] args) {
    List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
    sortBySalaryAndAlphabet(staff);
  }

  public static void sortBySalaryAndAlphabet(List<Employee> staff) {
    staff.stream().sorted(new SalaryComparator())
        .forEach(System.out::println);//1 вариант


    staff.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));//2 вариант
  }
}