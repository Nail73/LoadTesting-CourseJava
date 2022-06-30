public class Main {

  public static void main(String[] args) {
    int moneyAmount = 180;

    int cappuchinoPrice = 180;
    int lattePrice = 120;
    int espressoPrice = 80;
    int waterPrice = 20;

    boolean isMilkEnough = false;
    boolean canBuyAnything = false;

    boolean isMoneyEnoughForCappuchino = moneyAmount >= cappuchinoPrice;
    boolean isMoneyEnoughForLatte = moneyAmount >= lattePrice;
    boolean isMoneyEnoughForEspresso = moneyAmount >= espressoPrice;
    boolean isMoneyEnoughForWater = moneyAmount >= waterPrice;

    if (isMoneyEnoughForCappuchino && isMilkEnough) {
      System.out.println("Вы можете купить каппучино");
      canBuyAnything = true;
    }
    if (isMoneyEnoughForLatte && isMilkEnough) {
      System.out.println("Вы можете купить латте");
      canBuyAnything = true;
    }
    if (isMoneyEnoughForEspresso) {
      System.out.println("Вы можете купить эспрессо");
      canBuyAnything = true;
    }
    if (isMoneyEnoughForWater) {
      System.out.println("Вы можете купить воду");
      canBuyAnything = true;
    }
    if (canBuyAnything == false) {
      System.out.println("Недостаточно средств!");
    }
  }
}
