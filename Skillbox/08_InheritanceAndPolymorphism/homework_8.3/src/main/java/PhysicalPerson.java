public class PhysicalPerson extends Client {

  @Override
  public String print() {
    return "Баланс счета физического лица: " + getAmount() + "\n" +
        "Условия пополнения: без комисии" + "\n" +
        "Условия снятия: без комиссии в пределлах имеющейся суммы";
  }
}
