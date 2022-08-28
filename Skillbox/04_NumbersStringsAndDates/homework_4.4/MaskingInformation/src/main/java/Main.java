public class Main {

  public static void main(String[] args) {
  }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {
    while (true) {
      int indexFirstOpenDiamond = text.indexOf('<'); // получаем индексы скобок <>
      int indexFirstCloseDiamond = text.indexOf('>');

      if (indexFirstOpenDiamond < 0
          || indexFirstCloseDiamond < 0) { // если хоть одной скобки нет - заканчиваем цикл
        break;
      }

      text = text.substring(0, indexFirstOpenDiamond) + placeholder + text
          .substring(indexFirstCloseDiamond + 1); // заменяем текст и <> на placeholder

    }
    return text; // возвращаем результат
  }
}











    



