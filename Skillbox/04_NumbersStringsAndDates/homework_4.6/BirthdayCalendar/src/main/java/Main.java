import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {

    int day = 15;
    int month = 9;
    int year = 1989;

    System.out.println(collectBirthdays(year, month, day));
  }

  public static String collectBirthdays(int year, int month, int day) {
    Calendar today = new GregorianCalendar();
    Calendar birthday = Calendar.getInstance();
    birthday.set(year, month - 1, day);

    final String PRINT_DATE_FORMAT = "dd.MM.yyyy - E";
    SimpleDateFormat sdf = new SimpleDateFormat(PRINT_DATE_FORMAT, Locale.ENGLISH);
    String result = "";
    int age = 0;
    while (birthday.before(today)|| birthday.equals(today)) {
      result += age + " - " + sdf.format(birthday.getTime()) + "\n";
      birthday.add(Calendar.YEAR, 1);
      age++;
    }
    return result;
  }
}




















