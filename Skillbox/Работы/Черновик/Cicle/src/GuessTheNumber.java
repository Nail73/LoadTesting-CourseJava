import java.util.Scanner;

public class GuessTheNumber {

  public static void main(String[] args) {
    int attempt = new Scanner(System.in).nextInt();
    int value = 33;

    while (true) {
      if (attempt == value) {
        System.out.println("Вы угадали число!");
        break;
      } else if (attempt > value) {
        System.out.println("Загаданное число меньше.");
        attempt = new Scanner(System.in).nextInt();
      } else {
        System.out.println("Загаданное число больше.");
        attempt = new Scanner(System.in).nextInt();
      }
    }
  }
}
