public class Main {

  public static void main(String[] args) {

    int vasyaAge = 28;
    int mashaAge = 28;
    int mishaAge = 35;

    int min = -1;
    int middle = -1;
    int max = -1;

    if (vasyaAge < mashaAge && vasyaAge > mishaAge) {
      min = mishaAge;
      middle = vasyaAge;
      max = mashaAge;
      System.out.println(min);
      System.out.println(middle);
      System.out.println(max);
    }
    if (mashaAge < vasyaAge && mashaAge > mishaAge) {
      min = mishaAge;
      middle = mashaAge;
      max = vasyaAge;
      System.out.println(min);
      System.out.println(middle);
      System.out.println(max);
    }
    if (mishaAge < mashaAge && mishaAge > vasyaAge) {
      min = vasyaAge;
      middle = mishaAge;
      max = mashaAge;
      System.out.println(min);
      System.out.println(middle);
      System.out.println(max);
    }
    if (vasyaAge < mashaAge && mishaAge > mashaAge) {
      min = vasyaAge;
      middle = mashaAge;
      max = mishaAge;
      System.out.println(min);
      System.out.println(middle);
      System.out.println(max);
    }
    if (vasyaAge > mashaAge && mashaAge < mishaAge) {
      min = mashaAge;
      middle = vasyaAge;
      max = mishaAge;
      System.out.println(min);
      System.out.println(middle);
      System.out.println(max);
    }
    else  {
      System.out.println("Одинаковые возрасты");
    }
  }
}
