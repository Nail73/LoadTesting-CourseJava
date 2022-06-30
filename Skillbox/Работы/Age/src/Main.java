public class Main {
    public static void main(String[] args) {
        int vasyaAge = 55;
        int katyaAge = 25;
        int mishaAge = 35;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) { // ищем минимальный возраст
            min = vasyaAge;
        } else if (katyaAge < mishaAge) {
            min = katyaAge;
        } else {
            min = mishaAge;
        }

        System.out.println("min age: " + min);


        if (vasyaAge > katyaAge && vasyaAge < mishaAge || vasyaAge < katyaAge && vasyaAge > mishaAge) { // ищем средний возраст
            middle = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge < mishaAge || katyaAge < vasyaAge && katyaAge > mishaAge) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }
        System.out.println("middle age: " + middle);


        if (vasyaAge > katyaAge && vasyaAge > mishaAge) { // ищем максимальный возраст
            max = vasyaAge;
        } else if (katyaAge > mishaAge) {
            max = katyaAge;
        } else {
            max = mishaAge;
        }
        System.out.println("max age: " + max);


    }


}
