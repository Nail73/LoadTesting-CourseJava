public class Main {

  public static void main(String[] args) {
    String line = "Каждый охотник желает знать, где сидит фазан";

    ReverseArray reverseArray = new ReverseArray();
    String[] color = line.split(",?\\s+");
    for (int i = color.length - 1; i >= 0; i--) {
      System.out.print(color[i] + "\n");

    }
  }
}





