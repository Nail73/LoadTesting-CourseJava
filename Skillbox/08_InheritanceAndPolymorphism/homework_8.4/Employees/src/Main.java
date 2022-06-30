import company.Company;
import company.Employee;
import company.Manager;
import company.Operator;
import company.TopManager;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Company company = new Company();

    for (int i = 0; i < 180; i++) {
      company.hire(new Operator(30000));
    }

    List<Employee> workers = new ArrayList<>();
    for (int i = 0; i < 80; i++) {
      workers.add(new Manager(40000));
      if (i % 8 == 0) {
        workers.add(new TopManager(50000));
      }
    }
    company.hireAll(workers);

    System.out.println("Прибыль компании: " + company.getIncome() + " рублей");

    printEmployees(company);
    System.out.println("--------------------");
    List<Employee> employees = company.getEmployees();
    System.out.println("Количество сотрудников в компании: " + employees.size());
    for (int i = 0; i < employees.size() / 2; i++) {
      company.fire(employees.get(i));
    }
    System.out.println(
        "Количество сотрудников в компании после массовых увольнений: " + company.getEmployees()
            .size());
    printEmployees(company);
  }

  private static void printEmployees(Company company) {
    System.out.println("--------------------");
    System.out.println("Топ высоких зарплат: ");
    List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
    for (int i = 0; i < topSalaryStaff.size(); i++) {
      System.out.println(i + 1 + ") " + topSalaryStaff.get(i).getMonthSalary());
    }
    System.out.println("--------------------");
    System.out.println("Топ низких зарплат: ");
    List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(30);
    for (int i = 0; i < lowSalaryStaff.size(); i++) {
      System.out.println(i + 1 + ") " + lowSalaryStaff.get(i).getMonthSalary());
    }
  }
}
