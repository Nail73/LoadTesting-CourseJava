public class LegalPerson extends Client {

  private static final double COMISSION = 0.01;

  @Override
  public void take(double amountToTake) {
    super.take(amountToTake + (amountToTake * COMISSION));
  }
}
