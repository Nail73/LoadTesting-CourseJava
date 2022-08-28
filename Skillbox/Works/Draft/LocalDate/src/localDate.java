import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class localDate {

  public static void main(String[] args) {

    Date now = new Date();
    System.out.println(now);

    LocalDate now1 = LocalDate.now();
    System.out.println(now1);

    LocalDateTime now2 = LocalDateTime.now();
    System.out.println(now2);

    LocalDate birthday = LocalDate.of(1989, 9, 15);
    System.out.println(birthday.plusYears(18));

    LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
    System.out.println(nowNY);

    String date = "29/02/2021";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.parse(date, formatter);
    System.out.println(localDate);

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        .localizedBy(new Locale("us"));
    LocalDateTime today = LocalDateTime.now();
    System.out.println(dateTimeFormatter.format(today));

    LocalDateTime time1 = LocalDateTime.now();
    LocalDateTime time2 = LocalDateTime.now().minusDays(2);
    if (time1.isAfter(time2)) {
      System.out.println("time1 is after tome2");
    }

    LocalDateTime time3 = LocalDateTime.now();
    LocalDateTime time4 = time3.minusDays(2);
    System.out.println(time3.until(time4, ChronoUnit.HOURS));

    LocalDateTime now3 = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0,
        ZoneOffset.ofHours(4));
    System.out.println(now3);

    LocalDateTime now4 = LocalDateTime.now();
    System.out.println(now4.toEpochSecond(ZoneOffset.ofHours(3)));
  }
}
