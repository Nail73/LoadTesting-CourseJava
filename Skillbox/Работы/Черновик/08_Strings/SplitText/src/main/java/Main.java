public class Main {

  public static void main(String[] args) {

    String text = "At one point the main available land route out of Vancouver was to enter the US and then return to Canada. However, re-entering Canada from the US requires a negative coronavirus test, and roads in the border state of Washington were also affected by the storm.";
    System.out.println(splitTextIntoWords(text));
    splitTextIntoWords(text);
  }

  public static String splitTextIntoWords(String text) {

    String regex = "[;\\-,.\\s0-9]+";

    String[] arrayWords = text.split(regex);
    String word = "";
    for (String words : arrayWords) {
      word += words + "\n";
    }
    return word.trim();
  }
}