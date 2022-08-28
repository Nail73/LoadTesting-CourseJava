public class Country {

  private int countPeople;
  private double s;
  private String cityName;
  private String water;

  private String countryName;

  public Country(String countryName) {
    this.countryName = countryName;
  }

  public int getCountPeople() {
    return countPeople;
  }

  public void setCountPeople(int countPeople) {
    this.countPeople = countPeople;
  }

  public double getS() {
    return s;
  }

  public void setS(double s) {
    this.s = s;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getWater() {
    return water;
  }

  public void setWater(String water) {
    this.water = water;
  }
}
