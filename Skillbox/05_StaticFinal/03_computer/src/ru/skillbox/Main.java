package ru.skillbox;

public class Main {

  public static void main(String[] args) {

    Processor procIntel = new Processor(3.0, 6, "Intel", 0.3);
    Processor procAmd = new Processor(3.05, 5, "AMD", 0.6);
    Processor procAmd2 = new Processor(2.95, 4, "AMD2", 0.96);

    OZU ozuDdr1 = new OZU("DDR1", 2, 0.2);
    OZU ozuDdr2 = new OZU("DDR2", 3, 0.3);
    OZU ozuDdr3 = new OZU("DDR3", 5, 0.5);

    Monitor monitorIps = new Monitor(14.2, "IPS", 5.6);
    Monitor monitorTn = new Monitor(16.2, "TN", 7.6);
    Monitor monitorVa = new Monitor(12.5, "VA", 5.0);

    HDD hdd1 = new HDD("HDD", 150.2, 1.2);
    HDD ssd = new HDD("SDD", 250.2, 1.0);
    HDD hdd2 = new HDD("HDD", 300.0, 1.1);

    Keyboard keyboard1 = new Keyboard("Механическая", true, 0.9);
    Keyboard keyboard2 = new Keyboard("Мембранная", false, 0.5);
    Keyboard keyboard3 = new Keyboard("Сенсорная", true, 0.7);

    Computer notebook1 = new Computer("Apple", "Mac Pro - Rack", procAmd, ozuDdr2, monitorIps, hdd1,
        keyboard1);
    System.out.println(notebook1.toString());
    System.out.println("Общая масса компьютера: " + notebook1.weightComputer() + " кг" + "\n");

    Computer notebook2 = new Computer("Lenovo", "Legion T7 34IMZ5 90Q8004ARS", procIntel, ozuDdr3,
        monitorTn, ssd, keyboard3);
    System.out.println(notebook2.toString());
    System.out.println("Общая масса компьютера: " + notebook2.weightComputer() + " кг" + "\n");

    Computer notebook3 = new Computer("MSI", "Meg Infinite X", procAmd2, ozuDdr1, monitorVa, hdd2,
        keyboard2);
    System.out.println(notebook3.toString());
    System.out.println("Общая масса компьютера: " + notebook3.weightComputer() + " кг" + "\n");
  }
}

