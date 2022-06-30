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
    if (amountToPut < 0) {
      amount += 0;
    } else {
      amount += amountToPut;
    }
    return false;
  }

  public boolean take(double amountToTake) {
    if (amountToTake > amount) {
      amount -= 0;
    } else {
      amount -= amountToTake;
    }
    return false;
  }
}
