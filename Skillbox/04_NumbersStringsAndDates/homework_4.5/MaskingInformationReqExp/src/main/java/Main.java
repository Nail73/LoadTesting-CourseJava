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
      String offIndex = text.substring(indexFirstOpenDiamond, indexFirstCloseDiamond + 1);
      text = text.replaceAll(offIndex, placeholder);
    }
    return text;
  }
}