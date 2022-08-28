public abstract class Client {

  private double amount;

  public abstract String print();

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    } else {
      System.out.println("Сумма пополнения меньше 0");
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < getAmount()) {
      amount = amount - amountToTake;
    } else {
      System.out.println("Сумма для снятия больше, чем баланс вашего счета");
    }
  }
}

