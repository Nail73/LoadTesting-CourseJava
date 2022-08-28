public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    int indexVasya1 = text.indexOf(" ", 13);
    int indexVasya2 = text.indexOf(" ", 15);
    int indexPetya1 = text.indexOf(" ", 33);
    int indexPetya2 = text.indexOf(" ", 35);
    int indexMasha1 = text.indexOf(" ", 54);
    int indexMasha2 = text.indexOf(" ", 56);


    int vasyaZp = Integer.parseInt(text.substring(indexVasya1, indexVasya2).trim());
    int petyaZp = Integer.parseInt(text.substring(indexPetya1, indexPetya2).trim());
    int mashaZp = Integer.parseInt(text.substring(indexMasha1, indexMasha2).trim());

    int sum = vasyaZp + petyaZp + mashaZp;

    System.out.println(sum);


  }

}