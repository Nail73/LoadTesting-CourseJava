package ru.skillbox;

public class Main {

  public static void main(String[] args) {
    Country russia = new Country("Russia");
    russia.setCountryName("Russia");
    russia.setCapitalName("Moscow");
    russia.setPopulationSize(145_000_000);
    russia.setAccessSea(true);
    russia.setSquare(17_098_246);

    System.out.println("Страна: " + russia.getCountryName());
    System.out.println("Столица: " + russia.getCapitalName());
    System.out.println("Численность населения: " + russia.getPopulationSize() + " человек");
    System.out.println("Выход к морю: " + russia.isAccessSea());
    System.out.println("Площадь: " + russia.getSquare() + " кв.км");
    System.out.println();

    CountryChina countryChina = new CountryChina("China", 1_442_965_000, "Beijing");
    System.out.println("Страна: " + countryChina.getCountryName());
    System.out.println("Столица: " + countryChina.getCapitalName());
    System.out.println("Численность населения: " + countryChina.getPopulationSize() + " человек");
    countryChina.setPopulationSize(1_542_965_000);
    System.out.println(
        "Пока вы моргали, численность населения стала: " + countryChina.getPopulationSize()
            + " человек");
  }
}
