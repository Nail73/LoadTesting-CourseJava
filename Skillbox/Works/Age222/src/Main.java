public class Main {

  public static void main(String[] args) {

    int vasyaAge = 63;
    int katyaAge = 33;
    int mishaAge = 22;

    int minAge = -1;
    int middleAge = -1;
    int maxAge = -1;

    if (vasyaAge < katyaAge && vasyaAge < mishaAge){
      minAge = vasyaAge;
    }
    if (katyaAge < vasyaAge && katyaAge < mishaAge) {
      minAge = katyaAge;
    }
    if (mishaAge < vasyaAge && mishaAge < katyaAge) {
      minAge = mishaAge;
    }
    if (vasyaAge > katyaAge && vasyaAge > mishaAge){
      maxAge = vasyaAge;
    }
    if (katyaAge > vasyaAge && katyaAge > mishaAge) {
      maxAge = katyaAge;
    }
    if (mishaAge > vasyaAge && mishaAge > katyaAge) {
      maxAge = mishaAge;
    }
    if (vasyaAge > katyaAge && vasyaAge < mishaAge || vasyaAge < katyaAge && vasyaAge > mishaAge) { // ищем средний возраст
      middleAge = vasyaAge;
    } else if (katyaAge > vasyaAge && katyaAge < mishaAge || katyaAge < vasyaAge && katyaAge > mishaAge) {
      middleAge = katyaAge;
    } else {
      middleAge = mishaAge;
    }

    System.out.println("Min " + minAge);
    System.out.println("Middle " + middleAge);
    System.out.println("Max " + maxAge);
  }

}
