package ru.skillbox;

public class Keyboard {

  private final String type;
  private final boolean illumination;
  private final double weightKeyb;

  public Keyboard(String type, boolean illumination, double weightKeyb) {
    this.type = type;
    this.illumination = illumination;
    this.weightKeyb = weightKeyb;
  }

  public String getType() {
    return type;
  }

  public boolean isIllumination() {
    return illumination;
  }

  public double getWeightKeyb() {
    return weightKeyb;
  }
}
