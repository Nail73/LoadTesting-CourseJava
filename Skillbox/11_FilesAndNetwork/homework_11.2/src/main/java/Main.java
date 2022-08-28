import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Какую папку копируем?");

    Scanner scanner = new Scanner(System.in);
    String sourceDirectory = scanner.nextLine();

    System.out.println("Куда копируем?");

    String destinationDirectory = scanner.nextLine();

    FileUtils.copyFolder(sourceDirectory, destinationDirectory);

  }
}
