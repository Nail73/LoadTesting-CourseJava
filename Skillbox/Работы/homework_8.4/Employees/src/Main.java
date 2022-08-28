import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Company company = new Company();

    for (int i = 0; i < 180; i++) {
      company.hire(new Operator());
    }

    List<Employee> workers = new ArrayList<>();
    for (int i = 0; i < 80; i++) {
      workers.add(new Manager());

      if (i % 8 == 0) {
        workers.add(new TopManager(company));

      }
    }
    company.hireAll(workers);

    System.out.println("Прибыль компании: " + company.getIncome());

    printEmployees(company);
    System.out.println("--------------------");
    List<Employee> employees = company.getEmployees();
    System.out.println("Количество сотрудников в компании: " + employees.size());
    for (int i = 0; i < 135; i++) {
      company.fire(employees.get(i));
    }
    System.out.println(
        "Количество сотрудников в компании после массовых увольнений: " + company.getEmployees()
            .size());
    System.out.println("--------------------");
    printEmployees(company);
    System.out.println("--------------------");
  }

  private static void printEmployees(Company company) {
    System.out.println("--------------------");
    System.out.println("Топ высоких зарплат: ");
    List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
    for (Employee e : topSalaryStaff) {
      System.out.println(e.getMonthSalary());
    }
    System.out.println("--------------------");
    System.out.println("Топ низких зарплат: ");

    List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(10);
    for (Employee e : lowSalaryStaff) {
      System.out.println(e.getMonthSalary());
    }
