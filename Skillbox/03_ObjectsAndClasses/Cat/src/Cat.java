public class Cat {

  public static final int COUNT_EYE = 2;
  public static final double MINIMAL_WEIGHT = 1000.0;
  public static final double MAXIMAL_WEIGHT = 9000.0;

  private double originWeight;
  private double weight;

  private double minWeight;
  private double maxWeight;

  private double eat;

  private static int count = 0;

  private String name;

  private String color;


  public Cat() {
    weight = 1500.0 + 3000.0 * Math.random();
    originWeight = weight;
    minWeight = MINIMAL_WEIGHT;
    maxWeight = MAXIMAL_WEIGHT;
    count++;
  }

  public Cat(String name) {
    this();
    this.name = name;
  }

  public Cat(double weight) {
    this();
    this.weight = 1100.00;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public static int getCount() {
    return count;
  }

  public void meow() {
    if (isAlive()) {
      weight = weight - 1;
      System.out.println("Meow");
    }
    if (getWeight() <= minWeight) {
      count = count - 1;
    }
  }

  public void pee() {
    if (isAlive()) {
      weight = weight - 2;
      System.out.println("О мой Бог, наша кошка сходила в туалет, смотри сколько навалила! ");
    }
  }

  public void feed(Double amount) {
    if (isAlive()) {
      weight = weight + amount;
      eat += amount;
      if (getWeight() >= maxWeight) {
        count = count - 1;
      }
    }
  }

  public void eat() {
    System.out.println("Amount of food eaten: " + eat);
  }

  public void drink(Double amount) {
    if (isAlive()) {
      weight = weight + amount;
    }
    if (getWeight() >= maxWeight) {
      count = count - 1;
    }
  }

  public void pee(Double amount) {
    if (isAlive()) {
      weight = weight - amount;
    }
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(double newWeight) {
    weight = newWeight;
  }

  public Double getEat() {
    return eat;
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

  public String getLive() {
    if (weight < minWeight) {
      return "Inanimate";
    } else if (weight > maxWeight) {
      return "Inanimate";
    } else if (weight > originWeight) {
      return "Lively";
    } else {
      return "Lively";
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String newColor) {
    color = newColor;
  }

  public boolean isAlive() {
    return getWeight() >= minWeight && getWeight() <= maxWeight;
  }

  public static Cat copy(Cat original) {
    Cat copy = new Cat();
    copy.setWeight(original.getWeight());
    copy.setName(original.getName());
    copy.setColor(original.getColor());
    return copy;
  }

}



    














