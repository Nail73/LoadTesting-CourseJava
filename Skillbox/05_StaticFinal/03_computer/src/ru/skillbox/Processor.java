package ru.skillbox;

public class Processor {

  private final double frequency;
  private final int coresAmount;
  private final String vendorProc;
  private final double weightProc;

  public Processor(double frequency, int coresAmount, String vendorProc, double weightProc) {
    this.frequency = frequency;
    this.coresAmount = coresAmount;
    this.vendorProc = vendorProc;
    this.weightProc = weightProc;
  }

  public double getFrequency() {
    return frequency;
  }

  public int getCoresAmount() {
    return coresAmount;
  }

  public String getVendorProc() {
    return vendorProc;
  }

  public double getWeightProc() {
    return weightProc;
  }
}


