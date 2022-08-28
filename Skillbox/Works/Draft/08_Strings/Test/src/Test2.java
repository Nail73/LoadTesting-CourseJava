import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    if (n >= 1 && n <= 100) {
      String[] strings = new String[n];
      for (int i = 0; i < strings.length; i++) {
        strings[i] = sc.nextLine();
      }

      Pattern p = Pattern.compile("\\B([A-Z])");
      for (int i = 0; i < strings.length; i++) {
        Matcher m = p.matcher(strings[i]);
        StringBuffer strb = new StringBuffer();
        while (m.find()) {
          m.appendReplacement(strb, "_$0");
        }
        m.appendTail(strb);
        strings[i] = strb.toString().toLowerCase();
        System.out.println(strings[i]);
      }
    }
  }
}


