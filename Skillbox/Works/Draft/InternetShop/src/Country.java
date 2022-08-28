public class Country {

  private String nameCountry;
  private long populationSize;
  private double square;
  private String nameCapital;
  private boolean isAccessToTheSea;

  public Country(String nameCapital) {
    this.nameCapital = nameCapital;
  }

  public String getNameCountry() {
    return nameCountry;
  }

  public void setNameCountry(String nameCountry) {
    this.nameCountry = nameCountry;
  }

  public long getPopulationSize() {
    return populationSize;
  }

  public void setPopulationSize(long populationSize) {
    this.populationSize = populationSize;
  }

  public double getSquare() {
    return square;
  }

  public void setSquare(double square) {
    this.square = square;
  }

  public String getNameCapital() {
    return nameCapital;
  }

  public void setNameCapital(String nameCapital) {
    this.nameCapital = nameCapital;
  }

  public boolean isAccessToTheSea() {
    return isAccessToTheSea;
  }

  public void setAccessToTheSea(boolean accessToTheSea) {
    isAccessToTheSea = accessToTheSea;
  }
}

