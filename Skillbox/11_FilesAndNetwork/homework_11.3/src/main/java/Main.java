public class Main {

  public static void main(String[] args) {

    Movements cvsParser = new Movements("data/movementList.csv");
    cvsParser.printData();
  }
}