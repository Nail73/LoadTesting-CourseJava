public class GearBox {

  private static final int MAX_GEAR = 6;
  private static final int MIN_GEAR = 1;
  private int gear = 0;

  public final GearBoxType type;

  public GearBox (GearBoxType type) {
        this.type = type;
  }

  public GearBoxType getType() {
    return type;
  }

  public void shiftUp() {
    gear = gear < MAX_GEAR ? gear + 1 : gear;
  }

  public void shiftDown() {
    gear = gear > MIN_GEAR ? gear - 1 : gear;
  }

  public void switchRear() {
    gear = (gear > 1) ? gear : -1;
  }

  public void switchNeutral() {
    gear = 0;
  }

  public int getCurrentCar() {
    return gear;
  }

}
