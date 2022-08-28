package ru.skillbox;

public class OZU {

  private final String type;
  private final int memoryCapacity;
  private final double weightOzu;

  public OZU(String type, int memoryCapacity, double weightOzu) {
    this.type = type;
    this.memoryCapacity = memoryCapacity;
    this.weightOzu = weightOzu;
  }

  public String getType() {
    return type;
  }

  public int getMemoryCapacity() {
    return memoryCapacity;
  }

  public double getWeightOzu() {
    return weightOzu;
  }
}

