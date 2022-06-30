package ru.skillbox;

public class Monitor {

  private final double diagonal;
  private final String type;
  private final double weightMon;

  public Monitor(double diagonal, String type, double weightMon) {
    this.diagonal = diagonal;
    this.type = type;
    this.weightMon = weightMon;
  }

  public double getDiagonal() {
    return diagonal;
  }

  public String getType() {
    return type;
  }

  public double getWeightMon() {
    return weightMon;
  }
}
