public class BankAccount {

  private double amount;

  public boolean send(BankAccount receiver, double amount) {
    if (take(amount)) {
      return receiver.put(amount);
    }
    return false;
  }

  public double getAmount() {
    return amount;
  }

  public boolean put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    } else {
      System.out.println("Сумма пополнения меньше 0");
    }
    return false;
  }

  public boolean take(double amountToTake) {
    if (amountToTake < amount) {
      amount = amount - amountToTake;
    } else {
      System.out.println("Сумма для снятия больше, чем баланс вашего счета");
    }
    return false;
  }
}
