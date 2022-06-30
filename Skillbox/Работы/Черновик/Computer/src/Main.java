
public class Main {

  public static void main(String[] args) {
    Computer computer1 = new Computer("Intel", "Pentium4");
    computer1.setProcessor(8.5, 8, "USA", 0.2);
    computer1.setRAM("DDR3", 8, 0.5);
    computer1.setStorageOfInformation("HDD", 250, 5);
    computer1.setScreen(15.4, "IPS", 9);
    computer1.setKeyboard("Genius", true, 2.5);
    System.out.println(computer1.toString());
    computer1.calculationTotalMassComputer();
  }
}
