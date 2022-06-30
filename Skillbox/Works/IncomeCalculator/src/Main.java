import java.util.Scanner;

public class Main {
    private static int minIncome = 200000; // минимальный доход в компании
    private static int maxIncome = 900000; // максимальный доход компании

    private static int officeRentCharge = 140000; // расходы
    private static int telephonyCharge = 12000; // расходы
    private static int internetAccessCharge = 7200; // расходы

    private static int assistantSalary = 45000; // зарплата
    private static int financeManagerSalary = 90000; // зарплата

    private static double mainTaxPercent = 0.24; // процент отчислений в налоговую
    private static double managerPercent = 0.15; // процент премии

    private static double minInvestmentsAmount = 100000; // сумма минимальных инвестиций

    public static void main (String[] args) {
        while (true) {

                System.out.println("Введите сумму доходов компании за месяц " +
                        "(от 200 до 900 тысяч рублей): ");
                int income = (new Scanner(System.in)).nextInt();

                if (!checkIncomeRange(income)) {
                    continue;
                }
                double managerSalary = income * managerPercent; // переменные издержки
                double pureIncome = income - managerSalary -
                        calculateFixedCharges(); // постоянные издержки
                double margin = (income - managerSalary) / income; // маржинальность
                double tbu = calculateFixedCharges() / margin; // точка безубыточности
                double investAmount = (minInvestmentsAmount / (1 - mainTaxPercent) + calculateFixedCharges()) / (1 - managerPercent); // минимальная сумма при котором можно инвестировать
                double taxAmount = mainTaxPercent * pureIncome; // налоги
                double pureIncomeAfterTax = pureIncome - taxAmount; //чистая прибыль

                boolean canMakeInvestments = pureIncomeAfterTax >=
                        minInvestmentsAmount;

                System.out.println("Зарплата менеджера: " + managerSalary);
                System.out.println("Общая сумма налогов: " +
                        (taxAmount > 0 ? taxAmount : 0));
                System.out.println("Компания может инвестировать: " +
                        (canMakeInvestments ? "да" : "нет"));
                System.out.println("Минимальная сумма выручки, при котором можно инвестировать: " + investAmount);
                System.out.println("Точка безубыточности: " + tbu);
                if (pureIncome < 0) {
                    System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
                }
            }
        }


    private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() {
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }
}
