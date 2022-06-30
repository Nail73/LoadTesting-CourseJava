import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

  Map<String, String> phoneBook = new HashMap<>();
  Set<String> setOfNumbers = new TreeSet<>();
  private static final String REG_PHONE = "7\\d{10}";
  private static final String REG_NAME = "[А-Я][а-яА-Я]+";

  public boolean isPhone(String phone) {
    return phone.matches(REG_PHONE);
  }
  public boolean isName(String name) {
    return name.matches(REG_NAME);
  }
  public boolean isContainsPhone(String phone) {
    phoneBook.containsKey(phone);
    return false;
  }
  public boolean isContainsName (String name) {
    phoneBook.containsValue(name);
    return false;
  }

  private static void printMap(Map<String, String> map) {
    for (String key : map.keySet()) {
      System.out.println(key + " - " + map.get(key));
    }
  }

  public void addContact(String phone, String name) {

    if (name.matches(REG_NAME) && phone.matches(REG_PHONE)) {
      phoneBook.put(phone, name);
    }
  }

  public String getNameByPhone(String phone) {
    String name = phoneBook.get(phone);
    if (name != null) {
      return name + " - " + phone;
    }
    return "";
  }

  public Set<String> getPhonesByName(String name) {

    for (Entry<String, String> numbers : phoneBook.entrySet()) {
      if (numbers.getValue().equals(name)) {
        return Collections.singleton(name + " - " + numbers.getKey());
      }
    }
    return setOfNumbers;
  }

  public Set<String> getAllContacts() {

    for (String numbers : phoneBook.keySet()) {
      if (phoneBook.isEmpty() || phoneBook.get(numbers).equalsIgnoreCase(numbers)) {
        System.out.println(" ");
      } else {
        if (!phoneBook.get(numbers).isEmpty()) {
          setOfNumbers.add(phoneBook.get(numbers) + " - " + numbers);
        }
        printMap(phoneBook);
      }
    }
    return setOfNumbers;
  }


}