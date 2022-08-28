import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {

    int day = 15;
    int month = 9;
    int year = 1989;

    System.out.println(collectBirthdays(year, month, day));
  }

  public static String collectBirthdays(int year, int month, int day) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", Locale.ENGLISH);
    LocalDate birthday = LocalDate.of(year, month, day);
    LocalDate today = LocalDate.now();
    String result = "";
    int i = 0;
    StringBuilder sb = new StringBuilder();

    while (birthday.isBefore(today) || birthday.isEqual(today)) {

      result = i + " - " + birthday.format(formatter) + "\n";
      sb.append(result);
      i++;
      birthday = birthday.plusYears(1);
    }
    return sb.toString();
  }
}

