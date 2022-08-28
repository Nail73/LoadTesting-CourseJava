package ru.skillbox;

public class Computer {

  private final String vendor;
  private final String name;
  private final Processor processor;
  private final OZU ozu;
  private final Monitor monitor;
  private final HDD hdd;
  private final Keyboard keyboard;


  public Computer(String vendor, String name, Processor processor, OZU ozu,
      Monitor monitor, HDD hdd, Keyboard keyboard) {
    this.vendor = vendor;
    this.name = name;
    this.processor = processor;
    this.ozu = ozu;
    this.monitor = monitor;
    this.hdd = hdd;
    this.keyboard = keyboard;
  }

  public String getVendor() {
    return vendor;
  }

  public String getName() {
    return name;
  }

  public double weightComputer() {
    return processor.getWeightProc() + ozu.getWeightOzu() + monitor.getWeightMon() +
        hdd.getWeightHdd() + keyboard.getWeightKeyb();
  }

  public String toString() {
    return "Имя компьютера: " + getName() + "\n" +
        "Производства: " + getVendor() + "\n" +
        "Имеет параметры: " + "\n" + "\t" + "Процессор: " + "\n" + "\t" + "\t" +
        "Частота: " + processor.getFrequency() + " GHz" + "\n" + "\t" + "\t" +
        "Количество ядер: " + processor.getCoresAmount() + "\n" + "\t" + "\t" +
        "Производитель: " + processor.getVendorProc() + "\n" + "\t" +
        "ОЗУ: " + "\n" + "\t" + "\t" + "Тип: " + ozu.getType() + "\n" + "\t" + "\t" +
        "Объем: " + ozu.getMemoryCapacity() + " Гб" + "\n" + "\t" + "Монитор: " + "\n" + "\t" + "\t"
        +
        "Диагональ: " + monitor.getDiagonal() + " дюйма" + "\n" + "\t" + "\t" +
        "Тип: " + monitor.getType() + "\n" + "\t" + "Жесткий диск: " + "\n" + "\t" + "\t" +
        "Тип: " + hdd.getType() + "\n" + "\t" + "\t" + "Объем памяти: " + hdd.getMemory() + " Гб"
        + "\n" + "\t" +
        "Клавиатура: " + "\n" + "\t" + "\t" + "Тип: " + keyboard.getType() + "\n" + "\t" + "\t" +
        "Светится: " + keyboard.isIllumination();
  }
}
