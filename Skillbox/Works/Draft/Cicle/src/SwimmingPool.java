public class SwimmingPool {

  public static void main(String[] args) {
    int volume = 1200;
    int fillingSpeed = 30;
    int devastationSpeed = 10;
    int i = 0;
    int j = 1;

    while (i <= volume) {
      i += (fillingSpeed - devastationSpeed);
      System.out.println(j + " - " + i);
      j++;
    }
  }
}
