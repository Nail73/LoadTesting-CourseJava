public class CourierService {

  private final double weight;
  private final String deliveryAddress;
  private final boolean isItPossibleToFlip;
  private final String registrationNumber;
  private final boolean isTheCargoFragile;

  public CourierService(double weight, String deliveryAddress, boolean isItPossibleToFlip,
      String registrationNumber, boolean isTheCargoFragile) {
    this.weight = weight;
    this.deliveryAddress = deliveryAddress;
    this.isItPossibleToFlip = isItPossibleToFlip;
    this.registrationNumber = registrationNumber;
    this.isTheCargoFragile = isTheCargoFragile;
  }

  public boolean isItPossibleToFlip() {
    return isItPossibleToFlip;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public boolean isTheCargoFragile() {
    return isTheCargoFragile;
  }

  public double getWeight() {
    return weight;
  }

  public CourierService setWeight(double weight) {
    return new CourierService(weight, deliveryAddress, isItPossibleToFlip,
        registrationNumber, isTheCargoFragile);
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public CourierService setDeliveryAddress(String deliveryAddress) {
    return new CourierService(weight, deliveryAddress, isItPossibleToFlip,
        registrationNumber, isTheCargoFragile);
  }

  public static class Dimensions {

    private final double width;
    private final double height;
    private final double length;

    public double cargoVolumeCalculations(double width, double height, double length) {
      return width * height * length;
    }

    public Dimensions(double width, double height, double length) {
      this.width = width;
      this.height = height;
      this.length = length;
    }

    public double getWidth() {
      return width;
    }

    public Dimensions setWidth(double width) {
      return new Dimensions(width, height, length);
    }

    public double getHeight() {
      return height;
    }

    public Dimensions setHeight(double height) {
      return new Dimensions(width, height, length);
    }

    public double getLength() {
      return length;
    }

    public Dimensions setLength(double length) {
      return new Dimensions(width, height, length);
    }
  }

  public void print() {
    System.out.println(
        "\nВес груза: " + weight + "\n" + "Адрес доставки: " + deliveryAddress + "\n" +
            "Можно ли переворачивать: " + isItPossibleToFlip + "\n" + "Регистрационный номер: "
            + registrationNumber + "\n" +
            "Хрупкий ли груз: " + isTheCargoFragile);
  }
}
