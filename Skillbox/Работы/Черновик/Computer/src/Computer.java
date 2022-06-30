public class Computer {

  Processor processor = new Processor(8.5, 8, "USA", 0.2);
  RAM RAM = new RAM("DDR3", 8, 0.5);
  StorageOfInformation storageOfInformation = new StorageOfInformation("HDD", 250, 5);
  Screen screen = new Screen(15.4, "IPS", 9);
  Keyboard keyboard = new Keyboard("Genius", true, 2.5);

  private final String vendor;
  private final String name;

  public String getVendor() {
    return vendor;
  }

  public String getName() {
    return name;
  }

  public Computer(String vendor, String name) {
    this.vendor = vendor;
    this.name = name;
  }

  public void calculationTotalMassComputer() {
    double totalWeight = processor.getWeight() + RAM.getWeight() +
        storageOfInformation.getWeight() + screen.getWeight() +
        keyboard.getWeight();
    System.out.println("Общая масса компьютера: " + totalWeight + " кг.");
  }

  public String toString() {

    return "Компьютер: " + getName() +
        "\nПроизводства: " + getVendor() +
        "\nПроцессор: " +
        "\n\tЧастота: " + processor.getFrequency() +
        "\n\tКоличество ядер: " + processor.getNumberOfCores() +
        "\n\tПроизводитель: " + processor.getManufacturer() +
        "\n\tВес: " + processor.getWeight() +
        "\nОперативная память: " +
        "\n\tТип: " + RAM.getType() +
        "\n\tОбъем: " + RAM.getVolume() +
        "\n\tВес: " + RAM.getWeight() +
        "\nНакопитель информации: " +
        "\n\tТип: " + storageOfInformation.getType() +
        "\n\tОбъем: " + storageOfInformation.getMemoryCapacity() +
        "\n\tВес: " + storageOfInformation.getWeight() +
        "\nЭкран: " +
        "\n\tДиагональ: " + screen.getDiagonal() +
        "\n\tТип: " + screen.getType() +
        "\n\tВес: " + screen.getWeight() +
        "\nКлавиатура: " +
        "\n\tТип: " + keyboard.getType() +
        "\n\tС подсветкой: " + keyboard.isPresenceOfIllumination() +
        "\n\tВес: " + keyboard.getWeight();
  }

  public Processor getProcessor() {
    return processor;
  }

  public void setProcessor(double frequency, int numberOfCores, String manufacturer,
      double weight) {
  }

  public Computer.RAM getRAM() {
    return RAM;
  }

  public void setRAM(String type, double volume, double weight) {

  }

  public StorageOfInformation getStorageOfInformation() {
    return storageOfInformation;
  }

  public void setStorageOfInformation(String type, int memoryCapacity, double weight) {

  }

  public Screen getScreen() {
    return screen;
  }

  public void setScreen(double diagonal, String type, double weight) {

  }

  public Keyboard getKeyboard() {
    return keyboard;
  }

  public void setKeyboard(String type, boolean presenceOfIllumination, double weight) {

  }


  public final class Processor {

    private double frequency;
    private int numberOfCores;
    private String manufacturer;
    private double weight;

    public Processor(double frequency, int numberOfCores, String manufacturer, double weight) {
      this.frequency = frequency;
      this.numberOfCores = numberOfCores;
      this.manufacturer = manufacturer;
      this.weight = weight;
    }

    public double getFrequency() {
      return frequency;
    }

    public void setFrequency(double frequency) {
      this.frequency = frequency;
    }

    public int getNumberOfCores() {
      return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
      this.numberOfCores = numberOfCores;
    }

    public String getManufacturer() {
      return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }
  }

  public final class RAM {

    private String type;
    private double volume;
    private double weight;

    public RAM(String type, double volume, double weight) {
      this.type = type;
      this.volume = volume;
      this.weight = weight;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public double getVolume() {
      return volume;
    }

    public void setVolume(double volume) {
      this.volume = volume;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }
  }

  public final class StorageOfInformation {

    private String type;
    private int memoryCapacity;
    private double weight;

    public StorageOfInformation(String type, int memoryCapacity, double weight) {
      this.type = type;
      this.memoryCapacity = memoryCapacity;
      this.weight = weight;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public int getMemoryCapacity() {
      return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
      this.memoryCapacity = memoryCapacity;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }
  }

  public final class Screen {

    private double diagonal;
    private String type;
    private double weight;

    public Screen(double diagonal, String type, double weight) {
      this.diagonal = diagonal;
      this.type = type;
      this.weight = weight;
    }

    public double getDiagonal() {
      return diagonal;
    }

    public void setDiagonal(double diagonal) {
      this.diagonal = diagonal;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }
  }

  public final class Keyboard {

    private String type;
    private boolean presenceOfIllumination;
    private double weight;

    public Keyboard(String type, boolean presenceOfIllumination, double weight) {
      this.type = type;
      this.presenceOfIllumination = presenceOfIllumination;
      this.weight = weight;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public boolean isPresenceOfIllumination() {
      return presenceOfIllumination;
    }

    public void setPresenceOfIllumination(boolean presenceOfIllumination) {
      this.presenceOfIllumination = presenceOfIllumination;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }
  }

}
