public class Loader {

    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 30;
        int mishaAge = 60;

        int min = -1;
        int max = -1;
        int middle = -1;

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) { // ищем минимальный возраст
            min = vasyaAge;
        } else if (katyaAge < mishaAge) {
            min = mishaAge;
        } else {
            min = katyaAge;
        }

        System.out.println("min age: " + min);
    }
}