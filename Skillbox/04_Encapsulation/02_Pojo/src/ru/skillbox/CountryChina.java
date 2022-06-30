package ru.skillbox;

public class CountryChina {

  private String countryName;
  private long populationSize;
  private String capitalName;

  public CountryChina(String countryName, long populationSize, String capitalName) {
    this.countryName = countryName;
    this.populationSize = populationSize;
    this.capitalName = capitalName;
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

  public String getCapitalName() {
    return capitalName;
  }

  public void setCapitalName(String capitalName) {
    this.capitalName = capitalName;
  }
}
