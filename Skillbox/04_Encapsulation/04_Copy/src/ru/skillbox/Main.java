package ru.skillbox;

public class Main {

  public static void main(String[] args) {

    Dimensions dimensions = new Dimensions(5.5, 2.1, 1.3);
    double overallDimensions = dimensions.volume();

    CargoCourier cargoCourier = new CargoCourier(overallDimensions, 36.2, "Samara, Mira 22",
        true, "56ASD445", true);

    System.out.println(cargoCourier.toString());
  }
}
