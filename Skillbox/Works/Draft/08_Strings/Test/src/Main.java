import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    System.out.println(MorseToEng(n, s));
  }

  static final char[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
      'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
      'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
      ',', '.', '?'};

  static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
      "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
      "--..--", ".-.-.-", "..--.."};

  public static String MorseToEng(int n, String s) {

    String[] letters = s.split(" ");
    StringBuilder str = new StringBuilder();
    if (n == letters.length && n >= 1 && n <= 1000) {
      for (String letter : letters) {
        for (int j = 0; j < morse.length; j++) {
          if (morse[j].equals(letter)) {
            str.append(english[j]);
            break;
          }
        }
      }
    }
    return str.toString();
  }
}
