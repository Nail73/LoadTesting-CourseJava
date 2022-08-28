
public class Loader {

  public static void main(String[] args) {
    Cat messi = new Cat();
    Cat messiMessi = Cat.copy(messi);
    System.out.println("Messi Weight: " + messi.getWeight());
    System.out.println("Copy Weight: " + messiMessi.getWeight());
/////////
    Cat misha = getKitten();
    System.out.println("Misha Weight " + misha.getWeight());
    Cat sasha = getKitten();
    System.out.println("Sasha Weight " + sasha.getWeight());
    Cat pasha = getKitten();
    System.out.println("Pasha Weight " + pasha.getWeight());

    Cat murka = new Cat();
    System.out.println("Murka Weight: " + murka.getWeight() + " " + murka.getLive());
    murka.feed(100d);
    System.out.println("Murka Weight: " + murka.getWeight() + " " + murka.getLive());
    do {
      murka.feed(1000d);
      System.out.println("Murka already dialed: " + murka.getWeight() + " " + murka.getLive());
    }
    while (murka.getWeight() < 9000);
    System.out.println("Murka: " + murka.getStatus() + " " + murka.getLive());
    murka.feed(200d);
    System.out.println(murka.getWeight());
/////////
    Cat vasya = new Cat();
    System.out.println("Vasya Weight: " + vasya.getWeight() + " " + vasya.getLive());
    System.out.println("Color Vasya: " + Color.BLACK);
/////////
    Cat pushok = new Cat();
    System.out.println("Pushok Weight: " + pushok.getWeight() + " " + pushok.getLive());
    pushok.pee();
    System.out.println(
        "Pushok Weight after using the toilet: " + pushok.getWeight() + " " + pushok.getLive());
/////////
    Cat barsik = new Cat();
    System.out.println("Barsik Weight: " + barsik.getWeight() + " " + barsik.getLive());
    do {
      barsik.meow();
      System.out.println(barsik.getWeight() + " " + barsik.getLive());
    }
    while (barsik.getWeight() > 1000);
    System.out.println("Barsik: " + barsik.getStatus() + " " + barsik.getLive());

/////////
    Cat tomassio = new Cat();
    System.out.println("Tomassio Weight: " + tomassio.getWeight() + " " + tomassio.getLive());
    tomassio.feed(100d);
    tomassio.drink(250d);
    System.out.println("Tomassio Weight: " + tomassio.getWeight() + " " + tomassio.getLive());
    tomassio.eat();

//////////

    Cat ahmed = new Cat();
    System.out.println("Ahmed Weight: " + ahmed.getWeight() + " " + ahmed.getLive());
    ahmed.feed(150.00);
    System.out.println("Ahmed Weight with eat: " + ahmed.getWeight() + " " + ahmed.getLive());
    ahmed.eat();
    ahmed.pee();
    ahmed.pee();
    System.out.println("Ahmed Weight after relief: " + ahmed.getWeight() + " " + ahmed.getLive());

    //
    System.out.println("catCount = " + Cat.getCount());
  }
//////////

  private static Cat getKitten() {
    return new Cat(1100.00);
  }
/////////


}








