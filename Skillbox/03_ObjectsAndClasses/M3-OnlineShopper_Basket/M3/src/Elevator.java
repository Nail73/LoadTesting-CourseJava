public class Elevator {

  int currentFloor = 1;
  int minFloor;
  int maxFloor;

  public Elevator(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public int moveDown() {
    return currentFloor--;
  }

  public int moveUp() {
    return currentFloor++;
  }

  public void move(int floor) {
    if (floor < minFloor || floor > maxFloor) {
      System.out.println("Приплыли... Такого этажа нет");
    } else {
      for (currentFloor = 1; currentFloor <= floor; moveUp()) {
        System.out.println("Этаж: " + getCurrentFloor());
      }
      for (currentFloor = 1; currentFloor >= floor; moveDown()) {
        System.out.println("Этаж: " + getCurrentFloor());
      }
    }
  }
}
