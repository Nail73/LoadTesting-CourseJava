public class CardAccount extends BankAccount {

  private static final double DELTA = 0.01;

  @Override
  public boolean take(double amountToTake) {
    super.take(amountToTake + amountToTake * DELTA);
    return false;
  }
}


