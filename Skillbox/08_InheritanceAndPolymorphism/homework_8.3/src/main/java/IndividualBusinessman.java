public class IndividualBusinessman extends Client {

  private static final double DELTA_PUT = 0.01;
  private static final double DELTA_PUT_1000 = 0.005;

  @Override
  public String print() {
    return "Баланс счета ИП: " + getAmount() + "\n" +
        "Условия пополнения: При пололнении до 1000 рублей c комисией " + (int) (100 * DELTA_PUT)
        + " %" + "\n" +
        "При пололнении от 1000 рублей c комисией " + 100 * DELTA_PUT_1000 + " %" + "\n" +
        "Условия снятия: без комиссии в пределлах имеющейся суммы";
  }

  @Override
  public void put(double amountToPut) {
    double commission = amountToPut < 1000 ? DELTA_PUT : DELTA_PUT_1000;
    super.put(amountToPut - amountToPut * commission);
  }
}
