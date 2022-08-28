import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

  HashMap<String, String> phoneBook = new HashMap<>();

  public void addContact(String phone, String name) {
    if (checkingPhone(phone) && checkingName(name)) {
      phoneBook.put(phone, name);
    } else {
      System.out.println("Неверный формат ввода");
    }
  }

  public String getContactByPhone(String phone) {
    if (phoneBook.containsKey(phone)) {
      return phoneBook.get(phone) + " - " + phone;
    }
    return "";
  }

  public Set<String> getContactByName(String name) {
    if (phoneBook.containsValue(name)) {
      for (Entry<String, String> entry : phoneBook.entrySet()) {
        if (Objects.equals(name, entry.getValue())) {
          return Collections.singleton(name + " - " + entry.getKey());
        }
      }
    }
    return new TreeSet<>();
  }

  public Set<String> getAllContacts() {
    Map<String, TreeSet<String>> nameToPhones = new HashMap<>();
    for (String key : phoneBook.keySet()) {
      String name = phoneBook.get(key);
      if (!nameToPhones.containsKey(name)) {
        nameToPhones.put(name, new TreeSet<>());
      }
      nameToPhones.get(name).add(key);
    }
    Set<String> result = new TreeSet<>();
    for (String key : nameToPhones.keySet()) {
      String resultString = key + " - " + nameToPhones.get(key);
      result.add(resultString.replaceAll("[\\[\\]]", ""));
    }
    return result;
  }

  public boolean checkingPhone(String phone) {
    String regexPhone = "79[0-9]{9}";
    return phone.matches(regexPhone);
  }

  public boolean checkingName(String name) {
    String regexName = "[А-ЯЁа-яё]+[^0-9]+";
    return name.matches(regexName);
  }
}