public class TwoDimensionalArray {

  public static char symbol = 'X';

  public static char[][] getTwoDimensionalArray(int size) {
    char[][] array = new char[size][size];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (j == i || j == array.length - 1 - i) ? symbol : ' ';
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
    return array;
  }
}

