import java.lang.Character.UnicodeBlock;

public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 63000; i++) {

      char ch = (char) i;
      if (UnicodeBlock.of(ch) == UnicodeBlock.CYRILLIC) {
        System.out.println(i + " - " + (char) i);
      }
    }
  }
}
