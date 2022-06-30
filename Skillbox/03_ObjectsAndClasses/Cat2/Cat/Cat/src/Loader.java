public class Loader {

  private static Cat getKitten() {
    return new Cat(1100.0);
  }

  public static void main(String[] args) {

    Cat anna = new Cat("Анна");
    System.out.println("Вес Анны: " + anna.getWeight() + " грамм");
    anna.feed(100.0);
    System.out.println("Вес Анны после кормежки: " + anna.getWeight() + " грамм");
    System.out.println(anna.getIsNotLive());

    Cat boris = new Cat("Борис");
    System.out.println("Вес Бориса: " + boris.getWeight() + " грамм");
    boris.feed(150.0);
    System.out.println("Вес Бориса после кормежки: " + boris.getWeight() + " грамм");
    System.out.println("Сколько съел Борис: " + boris.getCountFeed() + " грамм");
    System.out.println(boris.getIsNotLive());

    Cat vasya = new Cat("Вася");
    System.out.println("Вес Васи: " + vasya.getWeight() + " грамм");
    while (vasya.getWeight() <= vasya.getMaxWeight()) {
      System.out.println("Вася ест!");
      vasya.feed(1000.0);
    }
    System.out.println("Вес Васи после кормежки: " + vasya.getWeight() + " грамм");
    System.out.println("Состояние Васи: " + vasya.getStatus());
    System.out.println("Сколько съел Вася: " + vasya.getCountFeed() + " грамм");
    System.out.println(vasya.getIsNotLive());

    Cat galya = new Cat("Галя");
    System.out.println("Вес Гали: " + galya.getWeight() + " грамм");
    while (galya.getWeight() >= galya.getMinWeight()) {
      galya.meow();
    }
    System.out.println("Вес Гали после истерик: " + galya.getWeight() + " грамм");
    System.out.println("Состояние Гали: " + galya.getStatus());
    System.out.println(galya.getIsNotLive());

    Cat dzek = new Cat("Джек");
    System.out.println("Вес Джека: " + dzek.getWeight() + " грамм");
    dzek.pee();
    System.out.println("Вес Джека: " + dzek.getWeight() + " грамм");
    System.out.println(dzek.getIsNotLive());

    Cat enot = new Cat("Енот");
    System.out.println("Вес Енота: " + enot.getWeight() + " грамм");
    enot.feed(150.0);
    enot.feed(100.0);
    enot.pee();
    enot.pee();
    enot.pee();
    System.out.println("Сколько съел Енот: " + enot.getCountFeed() + " грамм");
    System.out.println(enot.getIsNotLive());

    Cat zina = getKitten();
    System.out.println("Вес Зины: " + zina.getWeight() + " грамм");
    System.out.println("Окрас Зины: " + Color.BLACK);

    Cat kolya = getKitten();
    System.out.println("Вес Коли: " + kolya.getWeight() + " грамм");

    Cat lima = getKitten();
    System.out.println("Вес Лимы: " + lima.getWeight() + " грамм");

    Cat masha = new Cat(1500.0, "Кошка Маша");
    System.out.println(
        "Имя кошки: " + masha.getName() + "," + " вес кошки: " + masha.getWeight() + " грамм");

    Cat neo = new Cat(1500.0, "Кошка Нео это клон Маши");
    System.out
        .println("Имя кошки: " + neo.getName() + "," + " вес кошки: " + neo.getWeight() + " грамм");

    System.out.println("Количество живых кошек: " + Cat.getCount());
  }
}