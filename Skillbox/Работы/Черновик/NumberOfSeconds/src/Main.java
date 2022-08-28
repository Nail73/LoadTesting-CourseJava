public class Main {

  public static void main(String[] args) {

    int second = 3600000;



    int day = second / 60 / 60 / 24;
    int clock = (second - (second * 60 * 60 * 24)) % 24;
    int minute = second % (day * 24 + clock);
    int lostSecond = second - ((day * 24 + clock + minute * 60) * 60);


    System.out.println(day);
    System.out.println(clock);
    System.out.println(minute);
    System.out.println(lostSecond);

  }
}
