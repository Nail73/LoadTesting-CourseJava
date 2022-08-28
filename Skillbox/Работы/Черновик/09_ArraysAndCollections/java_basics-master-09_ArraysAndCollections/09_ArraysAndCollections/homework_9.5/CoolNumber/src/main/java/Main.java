import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    List<String> numbers = new ArrayList<>(List.of(
        "О444ЕС30", "А111ЕХ40",
        "В555УН152", "Р666СР164", "Н666ТТ58", "О666МК04", "Т777ТМ46",
        "А999НХ99", "У000ОН77", "У999НЕ09", "М666СК05", "О448ЕС30",
        "А777ВМ90", "Х222УС06", "А222ХК33", "М444НЕ199", "С888ВК21",
        "Н888ТМ41", "С111ЕХ40", "Т777НО154", "Н777ХМ61", "У888АТ50"));

    long startBruteForceSearchInList = System.nanoTime();
    boolean isBruteForceSearchInList = CoolNumbers.bruteForceSearchInList(numbers, "М666СК05");
    System.out.println("Поиск перебором: номер " + isBruteForceSearchInList + ", поиск занял " +
        (System.nanoTime() - startBruteForceSearchInList) + " нс");

    Collections.sort(numbers);
    long startBinarySearchInList = System.nanoTime();
    boolean isBinarySearchInList = CoolNumbers.bruteForceSearchInList(numbers, "М666СК05");
    System.out.println("Бинарный поиск: номер " + isBinarySearchInList + ", поиск занял " +
        (System.nanoTime() - startBinarySearchInList) + " нс");

    long startSearchInHashSet = System.nanoTime();

    boolean isSearchInHashSet = CoolNumbers.bruteForceSearchInList(numbers, "М666СК05");
    System.out.println("Поиск в HashSet: номер " + isSearchInHashSet + ", поиск занял " +
        (System.nanoTime() - startSearchInHashSet) + " нс");

    long startSearchInTreeSet = System.nanoTime();
    boolean isSearchInTreeSet = CoolNumbers.bruteForceSearchInList(numbers, "М666СК05");
    System.out.println("Поиск в TreeSet: номер " + isSearchInTreeSet + ", поиск занял " +
        (System.nanoTime() - startSearchInTreeSet) + " нс");
  }
}



