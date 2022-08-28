import java.time.Period;

public class Basket {

  private String items = "";
  private static int totalPrice = 0;
  private int limit;
  private double totalWeight = 0;

  private static int count = 0;
  private static int itemsCount = 0;

  private static int timeout = getTimeout();

  public PeriodType periodType;

  private static int getTimeout() {
    int secondsInHour = 3600;
    int hoursInDay = 24;
    int daysInWeek = 7;
    int daysInMonth = 30;
    return timeout = secondsInHour * hoursInDay * daysInWeek;
  }

  public Basket() {
    count++;
    totalPrice++;
    itemsCount++;
    items = "Список товаров: ";
    this.limit = 1000000;
  }

  public Basket(int limit, PeriodType periodType) {
    this();
    this.limit = limit;
    this.periodType = periodType;
  }

  public Basket(String items, int totalPrice, double totalWeight) {
    this();
    this.items = this.items + items;
    Basket.totalPrice = totalPrice;
    this.totalWeight = totalWeight;
  }

  public static int averageProductPrice() {
    return getTotalPrice() / getItemsCount();
  }

  public static int averageCostOfTheBasket() {
    return getTotalPrice() / getCount();
  }

  public static int getItemsCount() {
    return itemsCount;
  }

  public static int getCount() {
    return count;
  }

  public static void increaseCount(int count) {
    Basket.count = Basket.count + count;
  }

  public void add(String name, int price, double weight) {
    add(name, price, 1, weight);
  }

  public void add(String name, int price, int count, double weight) {
    if (contains(name)) {
      return;
    }
    if (totalPrice + count * price >= limit) {
      return;
    }
    items = items + "\n" + name + " - " + count + " шт. - " + price + " - " + weight;
    totalPrice = totalPrice + count * price;
    totalWeight = totalWeight + count * weight;
  }

  public void clear() {
    items = "";
    totalPrice = 0;
  }

  public static int getTotalPrice() {
    return totalPrice;
  }

  public double getTotalWeight() {
    return totalWeight;
  }

  public boolean contains(String name) {
    return items.contains(name);
  }


  public void print(String title) {
    System.out.println(title);
    if (items.isEmpty()) {
      System.out.println("Корзина пуста");
    } else {
      System.out.println(items);
    }
  }
}
