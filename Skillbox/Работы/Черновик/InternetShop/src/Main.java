public class Main {

  public static void main(String[] args) {

    Basket vasyaBasket = new Basket();
    vasyaBasket.add("Молоко", 80, 900);
    vasyaBasket.add("Хлеб", 40, 500);

    Basket petyaBasket = new Basket(500, PeriodType.WEEK);
    petyaBasket.add("Лопата", 280, 1200);
    petyaBasket.add("Бочка", 2900, 10000);

    Basket mashaBasket = new Basket("Стол", 5000, 15000);
    Basket sashaBasket = new Basket("Стул", 3000, 10000);
    Basket dashaBasket = new Basket("Сервант, Сигареты, Пиво, Шашлык", 33000, 25000);

    vasyaBasket.print("Корзина Васи: ");
    petyaBasket.print("Корзина Пети: ");
    mashaBasket.print("Корзина Маши: ");
    sashaBasket.print("Корзина Саши: ");
    dashaBasket.print("Корзина Даши: ");

    System.out.println("Количество корзин: " + Basket.getCount());
    System.out.println("Количество товаров: " + Basket.getItemsCount());
    System.out.println("Общая стоимость: " + Basket.getTotalPrice());
    System.out.println("Средняя цена товаров: " + Basket.averageProductPrice());
    System.out.println("Средняя стоимость корзины: " + Basket.averageCostOfTheBasket());

    DeliveryOrder deliveryOrder = new DeliveryOrder(DeliveryType.AUTO, IsFragile.NO,IsCold.YES);

    Arithmetic arithmetic = new Arithmetic(8, 4);
    System.out.println("\nСумма чисел a и b равно: " + arithmetic.add());
    System.out.println("Разность чисел a и b равно: " + arithmetic.difference());
    System.out.println("Частное чисел a и b равно: " + arithmetic.division());
    System.out.println("Произведение чисел a и b равно: " + arithmetic.multiplication() + "\n");

    Printer printer = new Printer();
    printer.append("Война и мир", "Толстой", 250);
    printer.print("Печать: ");
    printer.print("Очередь: ");

    CourierService courierService = new CourierService(2, "Ульяновск",
        false, "qwe123", true);
    courierService.print();

    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5, 9, Operation.MULTIPLY);
    arithmeticCalculator.calculate();

  }
}
