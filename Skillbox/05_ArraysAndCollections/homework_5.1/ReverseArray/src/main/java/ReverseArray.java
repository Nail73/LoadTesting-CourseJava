public class ReverseArray {

  public static String[] reverse(String[] strings) {

    for (int i = 0; i < strings.length / 2; i++) {
      int color = strings.length;
      String temp;

      for (i = 0; i < color / 2; i++) {
        temp = strings[color - i - 1];
        strings[color - i - 1] = strings[i];
        strings[i] = temp;
      }

      for (i = 0; i < strings.length; i++) {
        System.out.print(strings[i] + "\n");
      }

    }

    return strings;
  }
}

