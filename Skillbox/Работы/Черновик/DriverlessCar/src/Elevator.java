public class Elevator {

  private int currentFloor = 1;
  private int minFloor;
  private int maxFloor;

  public Elevator(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void moveDown() {
    currentFloor = (currentFloor > minFloor) ? currentFloor - 1 : currentFloor;
  }

  public void moveUp() {
    currentFloor = (currentFloor < maxFloor) ? currentFloor + 1 : currentFloor;
  }

  public void move(int floor) {

    for (; floor > getCurrentFloor(); moveUp()) {
      if (floor > maxFloor) {
        System.out.println("Ошибка. Выберите нужный этаж");
        break;
      }
      System.out.println("Этажи: " + getCurrentFloor());
    }
    for (; floor < getCurrentFloor(); moveDown()) {
      if (floor < minFloor) {
        System.out.println("Ошибка. Выберите нужный этаж");
        break;
      }
      System.out.println("Этажи: " + getCurrentFloor());

    }
    if (floor <= maxFloor && floor >= minFloor) {
      System.out.println("Ваш этаж: " + floor);
    }
  }
}




