import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    List<String> numbers = CoolNumbers.generateCoolNumbers();
    Collections.sort(numbers);
    HashSet<String> set = new HashSet<>(numbers);
    TreeSet<String> set1 = new TreeSet<>(numbers);

    while (true) {
      Scanner scanner = new Scanner(System.in);
      String stateNumber = scanner.nextLine();
      long result1 = System.nanoTime();
      if (CoolNumbers.bruteForceSearchInList(numbers, stateNumber)) {
        System.out.println(
            "Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - result1) + "нс");
      } else {
        System.out.println(
            "Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - result1)
                + "нс");
      }
      long result2 = System.nanoTime();
      if (CoolNumbers.binarySearchInList(numbers, stateNumber)) {
        System.out.println(
            "Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - result2) + "нс");
      } else {
        System.out.println(
            "Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - result2)
                + "нс");
      }
      long result3 = System.nanoTime();
      if (CoolNumbers.bruteForceSearchInHashSet(set, stateNumber)) {
        System.out.println(
            "Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - result3) + "нс");
      } else {
        System.out.println(
            "Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - result3)
                + "нс");
      }
      long result4 = System.nanoTime();
      if (CoolNumbers.bruteForceSearchInTreeSet(set1, stateNumber)) {
        System.out.println(
            "Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - result4) + "нс");
      } else {
        System.out.println(
            "Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - result4)
                + "нс");
      }
      if (stateNumber.equals("EXIT")) {
        break;
      }
    }
  }
}
/*
Хорошо себя в поиске показали HashSet b TreeSet, но думаю HashSet в целом побыстрее.
 */





