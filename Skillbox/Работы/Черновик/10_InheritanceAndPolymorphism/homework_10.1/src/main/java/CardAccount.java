public class CardAccount extends BankAccount {

  private static final double COMISSION = 0.01;

  @Override
  public boolean take(double amountToTake) {
    super.take(amountToTake + (amountToTake * COMISSION));
    return false;
  }
}
