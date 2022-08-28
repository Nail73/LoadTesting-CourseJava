import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String number = "А677МР197";
    String lettersList = "[АВЕКМНОРСТУХ]";
    String regex = lettersList + "[0-9]{3}" + lettersList + "{2}[0-9]{2,3}";
    System.out.println(number.matches(regex));

    String text = "Алексей, добрый день! Мой гитлаб: https://gitlab.skillbox.ru/fakhrtdinov_nail/ и мой сайт https://go.skillbox.ru/ ";

    String regex2 = "https:\\/\\/[^,\\s]+";
    Pattern pattern = Pattern.compile(regex2);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()){
      int start = matcher.start();
      int end = matcher.end();
      System.out.println(text.substring(start, end));
    }

    String text2 = "I        know  something        about         it";
    String [] words = text2.split("\\s+");
    for(int i = 0; i < words.length; i++){
      System.out.println(words[i]);
    }
    String phone1 = "+7 903 154 - 87 -54";
    String phone2 = "+7 (903) 154 - 87 -54";
    String phone3 = "7903154-87 -54";
    String phone4 = "7(903)1548754";

    System.out.println(formatPhoneNunber(phone1));
    System.out.println(formatPhoneNunber(phone2));
    System.out.println(formatPhoneNunber(phone3));
    System.out.println(formatPhoneNunber(phone4));




  }
  public static String formatPhoneNunber(String phone){
    String regex = "[^0-9]";
    return phone.replaceAll(regex, "");
  }
}
