package ru.skillbox;

public class Country {

  private String countryName;
  private long populationSize;
  private int square;
  private String capitalName;
  private boolean accessSea;

  public Country(String countryName) {
    this.countryName = countryName;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public long getPopulationSize() {
    return populationSize;
  }

  public void setPopulationSize(long populationSize) {
    this.populationSize = populationSize;
  }

  public int getSquare() {
    return square;
  }

  public void setSquare(int square) {
    this.square = square;
  }

  public String getCapitalName() {
    return capitalName;
  }

  public void setCapitalName(String capitalName) {
    this.capitalName = capitalName;
  }

  public boolean isAccessSea() {
    return accessSea;
  }

  public void setAccessSea(boolean accessSea) {
    this.accessSea = accessSea;
  }
}
