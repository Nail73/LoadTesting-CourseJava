import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Flight.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    Airport airport = Airport.getInstance();
    System.out.println(findPlanesLeavingInTheNextTwoHours(airport));
  }

  public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

    Date date = new Date();
    Date datePlusTwoHours = addHours(new Date(), 2);

    return airport.getTerminals().stream()
        .flatMap(t -> t.getFlights().stream())
        .filter(f -> f.getDate().after(date) && f.getDate().before(datePlusTwoHours))
        .filter(f -> f.getType() == Type.DEPARTURE)
        .collect(Collectors.toList());
  }

  public static Date addHours(Date date, int hours) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.HOUR_OF_DAY, hours);
    return calendar.getTime();
  }
}