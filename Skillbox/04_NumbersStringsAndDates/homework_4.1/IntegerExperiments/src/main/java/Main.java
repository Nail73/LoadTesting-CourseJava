public class Main {

  public static void main(String[] args) {

    char ch = 'C';
    int i = Character.digit('C' , 16);
    System.out.println("Метод получения int из char, результат: " + i);

    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(7843);


    System.out.println("Сумма цифр в числе - " + container.count + " " + "будет равна: " + sum);

    int a = sumDigits(7843);
    char b = (char) (a + '0');
    System.out.println(b);
  }
    public static int sumDigits(Integer number) {
    int sum = 0;
    for (String s : String.valueOf(number).split("")) sum+=Integer.parseInt(s);
    return sum;
    }

}


