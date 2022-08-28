public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей.";
    System.out.println(text);
    int v1 = text.indexOf("Вася заработал");
    int v2 = text.indexOf("руб");
    String str1 = text.substring(v1+14, v2).trim();
    System.out.println("Заработок Васи программистом: " + str1 + " руб.");

    int p3 = text.indexOf("Петя - ");
    int p4 = text.lastIndexOf("рубля");
    String str2 = text.substring(p3+7, p4).trim();
    System.out.println("Заработок Пети врачом: " + str2 + " руб.");

    int m5 = text.indexOf("а Маша - ");
    int m6 = text.lastIndexOf("руб");
    String str3 = text.substring(m5+9, m6).trim();
    System.out.println("Заработок Маши менеджером по клинингу: " + str3 + " руб.");

   int summa =Integer.parseInt(str1, 10)+Integer.parseInt(str2, 10)+Integer.parseInt(str3, 10);
   System.out.println("Общий заработок друзей: " + summa + " руб.");
  }
}