package ru.skillbox;

public class HDD {

  private final String type;
  private final double memory;
  private final double weightHdd;

  public HDD(String type, double memory, double weightHdd) {
    this.type = type;
    this.memory = memory;
    this.weightHdd = weightHdd;
  }

  public String getType() {
    return type;
  }

  public double getMemory() {
    return memory;
  }

  public double getWeightHdd() {
    return weightHdd;
  }
}

