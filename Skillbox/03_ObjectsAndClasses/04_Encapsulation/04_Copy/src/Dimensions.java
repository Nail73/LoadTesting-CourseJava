public class Dimensions {

  private final int dl;
  private final int sh;
  private final int vs;

  public int obiem() {
    return dl * sh * vs;
  }

  public int getDl() {
    return dl;
  }

  public int getSh() {
    return sh;
  }

  public int getVs() {
    return vs;
  }

  public Dimensions(int dl, int sh, int vs) {
    this.dl = dl;
    this.sh = sh;
    this.vs = vs;
  }
}
