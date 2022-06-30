public class IndividualBusinessman extends Client {

  private static final double COMISSION_PUT1 = 0.01;
  private static final double COMISSION_PUT2 = 0.005;

  @Override
  public void put(double amountToPut) {
    if (amountToPut >= 1000.0) {
      super.put(amountToPut - (amountToPut * COMISSION_PUT2));
    } else {
      super.put(amountToPut - (amountToPut * COMISSION_PUT1));
    }
  }
}
