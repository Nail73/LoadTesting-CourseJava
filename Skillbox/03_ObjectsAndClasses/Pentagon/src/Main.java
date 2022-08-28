import com.skillbox.airport.Airport;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

        Airport airport;
        airport = Airport.getInstance();
        airport.getAllAircrafts();
        System.out.println("Какие самолеты летят бомбить объект: " + airport.getAllAircrafts());

        Class<ArrayList> count = ArrayList.class;
        System.out.println("Количество самолетов в ангаре: " + airport.getAllAircrafts().size());
        }
    }

