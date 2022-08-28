import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController {
    private static double passengerCarMaxWeight = 7000.0; // kg
    private static double cargoAutoWeight = 3500.0;
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 9500; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        int carHeight = car.height;
        double carWeight = car.weight;
        int price = 0;

        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            double weight = car.weight;
        }
            //Грузовой автомобиль

                if (carWeight > passengerCarMaxWeight) {
                blockWay("масса вашего ТС превышает допустимый порог пропускного пункта!");
                return -1;
            } if (carWeight < passengerCarMaxWeight && carWeight > cargoAutoWeight) {
                price = cargoCarPrice;
                } else if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }

            //Легковой автомобиль
            if (carWeight > passengerCarMaxWeight) {
                blockWay("масса вашего ТС превышает допустимый порог пропускного пункта!");
                return -1;
            }
            if (carWeight < passengerCarMaxWeight && carWeight < cargoAutoWeight) {
                price = passengerCarPrice;
            } else if (car.hasVehicle) {
            price = price + vehicleAdditionalPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }
}