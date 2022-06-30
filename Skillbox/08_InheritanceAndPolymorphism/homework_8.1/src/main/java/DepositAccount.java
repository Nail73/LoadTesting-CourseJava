import java.time.LocalDate;

public class DepositAccount extends BankAccount {

  private LocalDate lastIncome = LocalDate.now();

  @Override
  public boolean put(double amountToPut) {
    if (super.put(amountToPut)) {
      lastIncome = LocalDate.now();
    }
    return false;
  }

  @Override
  public boolean take(double amountToTake) {
    if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
      return super.take(amountToTake);
    } else {
      System.out.println("С момента последнего пополнения прошло менее месяца");
    }
    return false;
  }
}

