public class LegalPerson extends Client {

  private static final double DELTA_TAKE = 0.01;

  @Override
  public String print() {
    return "Баланс счета юридического лица: " + getAmount() + "\n" +
        "Условия пополнения: без комисии" + "\n" +
        "Условия снятия: с комиссией в " + (int) (DELTA_TAKE * 100) + " %"
        + " пределлах имеющейся суммы";
  }

  @Override
  public void take(double amountToTake) {
    super.take(amountToTake + amountToTake * DELTA_TAKE);
  }
}
