import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    String formatText = "23/05/1995";
    System.out.println("Дата основания языка Java: " + formatText);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate today = LocalDate.now();
    System.out.println("Сегодняшняя дата: " + today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    LocalDate localDate = LocalDate.parse(formatText, formatter);
    System.out.println(getPeriodFromBirthday(localDate));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {

    birthday = LocalDate.of(1995, 5, 23);
    LocalDate years = LocalDate.now().minusYears(birthday.getYear());
    LocalDate months = LocalDate.now().minusMonths(birthday.getMonthValue());
    LocalDate days = LocalDate.now().minusDays(birthday.getDayOfMonth());

    return "Passed: " + years.getYear() + " years, " + months.getMonthValue() + " months, "
        + days.getDayOfMonth() + " days.";
  }
}
