import core.Line;
import core.Station;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {

  List<Station> threeTransfersRoute;
  List<Station> twoTransfersRoute;
  List<Station> noTransferRoute;

  StationIndex stationIndex;
  RouteCalculator calculator;

  Station kuvshinovka;
  Station plodovoe;
  Station krotovka;
  Station sever;


  @Override
  public void setUp() throws Exception {

    stationIndex = new StationIndex();

    Line line1 = new Line(1, "Первая");
    Line line2 = new Line(2, "Вторая");
    Line line3 = new Line(3, "Третья");

    kuvshinovka = new Station("Кувшиновка", line1);
    Station lugovoe = new Station("Луговое", line1);
    krotovka = new Station("Кротовка", line1);
    sever = new Station("Север", line2);
    Station barataevka = new Station("Баратаевка", line2);
    Station arskoe = new Station("Арское", line2);
    plodovoe = new Station("Плодовое", line3);
    Station kluch = new Station("Ключ", line3);
    Station seld = new Station("Сельдь", line3);

    Stream.of(line1, line2, line3).forEach(stationIndex::addLine);
    Stream
        .of(kuvshinovka, lugovoe, krotovka, sever, barataevka, arskoe, plodovoe, kluch,
            seld).peek(s -> s.getLine().addStation(s)).forEach(stationIndex::addStation);
    stationIndex.addConnection(Stream.of(lugovoe, barataevka).collect(Collectors.toList()));
    stationIndex.addConnection(Stream.of(arskoe, seld).collect(Collectors.toList()));
    stationIndex.getConnectedStations(lugovoe);
    stationIndex.getConnectedStations(arskoe);

    calculator = new RouteCalculator(stationIndex);

    //тестовые маршруты
    noTransferRoute = Stream.of(kuvshinovka, lugovoe, krotovka).collect(Collectors.toList());
    twoTransfersRoute = Stream.of(kuvshinovka, lugovoe, barataevka, sever)
        .collect(Collectors.toList());
    threeTransfersRoute = Stream
        .of(kuvshinovka, lugovoe, barataevka, arskoe, seld, kluch, plodovoe)
        .collect(Collectors.toList());
  }

  public void testCalculateDuration() {
    double actual = RouteCalculator.calculateDuration(threeTransfersRoute);
    double expected = 17;
    assertEquals(expected, actual);
  }

  public void testGetShortestRoute() {
    List<Station> actualNoTransfer = calculator.getShortestRoute(kuvshinovka, krotovka);
    List<Station> actualTwoTransfer = calculator.getShortestRoute(kuvshinovka, sever);
    List<Station> actualThreeTransfers = calculator.getShortestRoute(kuvshinovka, plodovoe);

    List<Station> expectedNoTransfers = noTransferRoute;
    List<Station> expectedTwoTransfers = twoTransfersRoute;
    List<Station> expectedThreeTransfers = threeTransfersRoute;

    assertEquals(actualNoTransfer, expectedNoTransfers);
    assertEquals(actualTwoTransfer, expectedTwoTransfers);
    assertEquals(actualThreeTransfers, expectedThreeTransfers);
  }


}
