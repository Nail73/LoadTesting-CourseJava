import core.Line;
import core.Station;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

public class RouteCalculatorTest extends TestCase {

  List<Station> route;
  List<Station> getShortestRoute;


  @Before
  public void setUp() throws Exception {
    route = new ArrayList<>();
    getShortestRoute = new ArrayList<>();

    Line line1 = new Line(1, "First");
    Line line2 = new Line(2, "Second");
    Line line3 = new Line(3, "Third");
    Line line4 = new Line(2, "Four");

    route.add(new Station("Петровская", line1));
    route.add(new Station("Арбузная", line1));
    route.add(new Station("Морковная", line2));
    route.add(new Station("Яблочная", line2));
    route.add(new Station("Грушевая", line3));
    route.add(new Station("Виноградная", line3));
    route.add(new Station("Мандариновая", line4));
    route.add(new Station("Хлебная", line4));

  }

  @After
  public void tearDown() throws Exception {
  }

  public void testGetShortestRoute() {
    boolean expected;
    Station from = route.get(0);
    Station to = route.get(5);
    boolean actual = from.getLine().equals(to.getLine());
    if (actual) {
      expected = true;
    } else {
      expected = false;
    }
    assertEquals(expected, actual);
  }

  public void testCalculateDuration() {
    double actual = RouteCalculator.calculateDuration(route);
    double expected = 20.5;
    assertEquals(expected, actual);
  }

  public void testGetRouteOnTheLine() {
    Station from = route.get(0);
    Station to = route.get(3);
    int actual = from.getLine().compareTo(to.getLine());
    int expected = -1;
    assertEquals(expected, actual);
  }

  public void testGetRouteWithOneConnection() {
    Station from = route.get(0);
    Station to = route.get(1);
    int actual = from.getLine().compareTo(to.getLine());
    int expected = 0;
    assertEquals(expected, actual);
  }
}

