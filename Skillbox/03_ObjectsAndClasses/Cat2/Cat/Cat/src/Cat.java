public class Cat {

  public static final double MIN_WEIGHT = 1000.0;
  public static final double MAX_WEIGHT = 9000.0;
  public static final int EYE = 2;

  private double originWeight;
  private double weight;

  private double minWeight;
  private double maxWeight;

  private double countFeed;
  private static int count;

  private String name;
  private String Color;

  public String Color() {
    return Color;
  }

  public Cat() {
    weight = 1500.0 + 3000.0 * Math.random();
    originWeight = weight;
    minWeight = 1000.0;
    maxWeight = 9000.0;
    count++;
  }

  public Cat(String name) {
    this();
    this.name = name;
  }

  public Cat(double weight) {
    this();
    this.weight = 1100.0;
  }

  public Cat(double weight, String name) {
    this();
    this.weight = weight;
    this.name = name;
  }

  public String getColor() {
    return Color;
  }

  public void setColor(String color) {
    Color = color;
  }

  public String getName() {
    return name;
  }

  public double getCountFeed() {
    return countFeed;
  }

  public double getMinWeight() {
    return minWeight;
  }

  public static int getCount() {
    return count;
  }

  public double getMaxWeight() {
    return maxWeight;
  }

  public void meow() {
    if (!isNotLive()) {
      weight = weight - 1;
      System.out.println("Meow");
    }
    if (getWeight() <= minWeight) {
      count = count - 1;
    }
  }

  public void pee() {
    if (!isNotLive()) {
      weight = weight - 100;
      System.out.println("Кот сходит в туалет!");
    }
    if (getWeight() <= minWeight) {
      count = count - 1;
    }
  }

  public void feed(Double amount) {
    if (!isNotLive()) {
      weight = weight + amount;
      countFeed += amount;
    }
    if (getWeight() >= maxWeight) {
      count = count - 1;
    }
  }

  public void drink(Double amount) {
    if (!isNotLive()) {
      weight = weight + amount;
    }
    if (getWeight() >= maxWeight) {
      count = count - 1;
    }
  }

  public boolean isNotLive() {
    return getWeight() <= minWeight && getWeight() >= maxWeight;
  }

  public String getIsNotLive() {
    if (weight < minWeight) {
      return "Кошка мертва!";
    } else if (weight > maxWeight) {
      return "Кошка мертва!";
    } else if (weight > originWeight) {
      return "Кошка жива!";
    } else {
      return "Кошка жива!";
    }
  }

  public Double getWeight() {
    return weight;
  }

  public String getStatus() {
    if (weight < minWeight) {
      return "Dead";
    } else if (weight > maxWeight) {
      return "Exploded";
    } else if (weight > originWeight) {
      return "Sleeping";
    } else {
      return "Playing";
    }
  }
}