import java.time.LocalDate;

public class DepositAccount extends BankAccount {

  LocalDate today = LocalDate.now();
  LocalDate lastIncome = LocalDate.now();

  @Override
  public boolean put(double amountToPut) {
    super.put(amountToPut);
    this.lastIncome = LocalDate.now();
    return false;
  }

  @Override
  public boolean take(double amountToTake) {
    if (today.minusMonths(1).isAfter(lastIncome)) {
      super.take(amountToTake);
    } else {
      System.out.println("С даты последнего пополнения, прошло менее месяца");
    }
    return false;
  }
}
