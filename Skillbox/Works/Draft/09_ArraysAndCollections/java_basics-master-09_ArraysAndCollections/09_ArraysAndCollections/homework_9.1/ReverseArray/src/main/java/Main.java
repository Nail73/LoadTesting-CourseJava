import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String line = "Каждый охотник желает знать, где сидит фазан";

    String[] array = line.split(",?\\s+");
    int size = array.length;
    for (int i = 0; i < size / 2; i++) {
      String temp2 = array[i];
      array[i] = array[size - 1 - i];
      array[size - 1 - i] = temp2;
    }
    System.out.println(Arrays.toString(array));
  }
}
