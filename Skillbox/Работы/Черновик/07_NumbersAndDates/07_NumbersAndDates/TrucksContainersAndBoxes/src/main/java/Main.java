import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String boxes = scanner.nextLine();
    double boxesCount = Double.parseDouble(boxes);

    int MAX_COUNT_CARGO = 324;
    int container = (int) Math.ceil(boxesCount / 27);
    int box = (int) (boxesCount % 27);
    int truck = (int) Math.ceil(boxesCount / MAX_COUNT_CARGO);

    int a = 1;
    int b = 1;
    int c = 1;

    for (a = 1; a <= truck; a++) {

      System.out.println("Грузовик: " + a);

      for (b = 1; b <= container; b++) {

        if (b % 13 == 0) {
          break;
        }
        if (a > 1 && b == 1) {
          b += 12;
        }

        System.out.println("\tКонтейнер: " + b);

        while (c <= boxesCount) {

          System.out.println("\t\tЯщик: " + c);

          c++;
          if (c % 27 == 0) {
            System.out.println("\t\tЯщик: " + c);
            c++;
            break;
          }
        }
        if (c > boxesCount) {
          break;
        }
      }
    }
    System.out.println("Необходимо:\n"
        + "грузовиков - " + truck + " шт.\n"
        + "контейнеров - " + container + " шт.");
  }
}






