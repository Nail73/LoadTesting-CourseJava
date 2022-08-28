import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int boxes = 0;
    Scanner scanner = new Scanner(System.in);
    boxes = Integer.parseInt(scanner.nextLine());
    TrucksContainersAndBoxes trucksContainersAndBoxes = new TrucksContainersAndBoxes(boxes);
    trucksContainersAndBoxes.result();
  }

  public static class TrucksContainersAndBoxes {

    private int truck;
    private int container;
    private int boxes;

    public TrucksContainersAndBoxes(int boxes) {
      this.boxes = boxes;
      if (boxes != 0) {
        container = boxes % 27 == 0 ? boxes / 27 : boxes / 27 + 1;
      }
      if (container != 0) {
        truck = container % 12 == 0 ? container / 12 : container / 12 + 1;
      }
    }

    public int getTruck() {
      return truck;
    }

    public int getContainer() {
      return container;
    }

    public int getBoxes() {
      return boxes;
    }

    public void result() {
      if (boxes == 0) {
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + getTruck() + " шт.");
        System.out.println("контейнеров - " + getContainer() + " шт.");
      } else {
        int boxes = 1;
        int container = 1;
        for (int i = 1; i <= truck; i++) {
          System.out.println("Грузовик: " + i);

          int j = 0;
          while (j < 12 && container <= getContainer()) {
            System.out.println("\tКонтейнер: " + container);
            int k = 0;
            while (k < 27 && boxes <= getBoxes()) {
              System.out.println("\t\tЯщик: " + boxes);
              k++;
              boxes++;
            }
            j++;
            container++;
          }
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + getTruck() + " шт.");
        System.out.println("контейнеров - " + getContainer() + " шт.");
      }
    }
  }
}



