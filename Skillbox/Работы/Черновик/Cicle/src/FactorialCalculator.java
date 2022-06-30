import java.util.Scanner;

public class FactorialCalculator {

  public static void main(String[] args) {

    int value = new Scanner(System.in).nextInt();
    System.out.println(value + "!= " + creatFactorial(value));
  }

  public static int creatFactorial(int value) {
    int multi = 1;
    for (int i = 1; i <= value; i++) {
      multi = multi * i;
    }
    return multi;
  }
}

