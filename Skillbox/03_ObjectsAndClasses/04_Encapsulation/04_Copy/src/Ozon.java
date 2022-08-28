public class Ozon {

  Dimensions dimensions = new Dimensions(10, 5, 20);

  private double weight;
  private String adress;
  private String regNumber;
  boolean perevorot = false;
  boolean hrust = false;

  public Dimensions getDimensions() {
    return dimensions;
  }

  public Ozon setDimensions(Dimensions dimensions) {
    return new Ozon(dimensions, weight, adress, regNumber, perevorot, hrust);
  }

  public double getWeight() {
    return weight;
  }

  public Ozon setWeight(double weight) {
    return new Ozon(dimensions, weight, adress, regNumber, perevorot, hrust);
  }

  public String getAdress() {
    return adress;
  }

  public Ozon setAdress(String adress) {
    return new Ozon(dimensions, weight, adress, regNumber, perevorot, hrust);
  }

  public String getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  public boolean isPerevorot() {
    return perevorot;
  }

  public void setPerevorot(boolean perevorot) {
    this.perevorot = perevorot;
  }

  public boolean isHrust() {
    return hrust;
  }

  public void setHrust(boolean hrust) {
    this.hrust = hrust;
  }

  public Ozon(Dimensions dimensions, double weight, String adress, String regNumber,
      boolean perevorot, boolean hrust) {
    this.dimensions = dimensions;
    this.weight = weight;
    this.adress = adress;
    this.regNumber = regNumber;
    this.perevorot = perevorot;
    this.hrust = hrust;
  }
}


