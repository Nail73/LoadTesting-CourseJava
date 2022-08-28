package ru.skillbox;

public class Elevator {

  private int currentFloor = 1;
  private final int minFloor;
  private final int maxFloor;

  public Elevator(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void moveDown() {
    currentFloor--;
  }

  public void moveUp() {
    currentFloor++;
  }

  public void move(int floor) {
    if (floor < minFloor || floor > maxFloor) {
      System.out.println("Приплыли... Такого этажа нет");
      return;
    }

    while (currentFloor != floor) {
      if (floor < currentFloor) {
        moveDown();
      } else {
        moveUp();
      }
      System.out.println("Этаж: " + currentFloor);
    }
  }
}
