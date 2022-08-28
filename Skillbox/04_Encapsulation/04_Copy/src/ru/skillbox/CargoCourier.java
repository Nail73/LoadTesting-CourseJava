package ru.skillbox;

public class CargoCourier {

  Dimensions dimensions = new Dimensions(5.5, 2.1, 1.3);
  private final double overallDimensions = dimensions.volume();
  private final double weight;
  private final String deliverAddress;
  private final boolean flipOver;
  private final String registrationNumber;
  private final boolean brittle;

  public CargoCourier(double overallDimensions, double weight, String deliverAddress,
      boolean flipOver, String registrationNumber, boolean brittle) {

    this.weight = weight;
    this.deliverAddress = deliverAddress;
    this.flipOver = flipOver;
    this.registrationNumber = registrationNumber;
    this.brittle = brittle;
  }

  public CargoCourier setDeliverAddress(String deliverAddress) {
    return new CargoCourier(overallDimensions, weight, deliverAddress, flipOver, registrationNumber,
        brittle);
  }

  public CargoCourier setWeight(double weight) {
    return new CargoCourier(overallDimensions, weight, deliverAddress, flipOver, registrationNumber,
        brittle);
  }

  public double getWeight() {
    return weight;
  }

  public String getDeliverAddress() {
    return deliverAddress;
  }

  public boolean isFlipOver() {
    return flipOver;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public boolean isBrittle() {
    return brittle;
  }

  public double getOverallDimensions() {
    return overallDimensions;
  }

  public String toString() {
    return "Габариты груза: " + getOverallDimensions() + "\n" +
        "Масса: " + getWeight() + "\n" +
        "Адрес доставки: " + getDeliverAddress() + "\n" +
        "Регистрационный номер: " + getRegistrationNumber() + "\n" +
        "Можно ли переворачивать: " + isFlipOver() + "\n" +
        "Хрупкий ли груз: " + isBrittle();
  }
}
