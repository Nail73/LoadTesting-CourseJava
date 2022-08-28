public class TwoDimensionalArray {

  public static char symbol = 'X';
  public static char spase = ' ';

  public static char[][] getTwoDimensionalArray(int size) {

    char[][] array = new char[size][size];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (i == j || (i + j) == array.length - 1) {
          array[i][j] = symbol;
        } else {
          array[i][j] = spase;
        }
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
    return array;
  }
}
