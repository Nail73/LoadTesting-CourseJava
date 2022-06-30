import java.util.Scanner;

public class ForCycle {

  public static void main(String[] args) {

    int value = new Scanner(System.in).nextInt();

    for (int i = 1; i <= value; i++) {
      for (int j = 1; j <= value; j++) {
        if (i * j == value) {
          System.out.println("Варианты произведений " + value + " = " + i + " * " + j);
        }
      }
    }
  }
}
