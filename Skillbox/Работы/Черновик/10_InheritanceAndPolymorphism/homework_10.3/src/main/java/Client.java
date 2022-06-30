public abstract class Client {

  double amount;

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount += amountToPut;
    } else {
      System.out.println("Сумма пополнения меньше 0");
    }
  }

  public void take(double amountToTake) {
    if (amountToTake > amount) {
      System.out.println("Сумма запроса на снятие, больше баланса");
    } else {

      amount -= amountToTake;
    }
  }
}
