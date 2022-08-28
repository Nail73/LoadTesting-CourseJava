import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {

  private final Map<String, Customer> storage;

  public CustomerStorage() {
    storage = new HashMap<>();
  }

  public void addCustomer(String data) {
    final int INDEX_NAME = 0;
    final int INDEX_SURNAME = 1;
    final int INDEX_EMAIL = 2;
    final int INDEX_PHONE = 3;

    String emailRegex = "\\b[A-Za-z0-9. %+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
    String numberRegex = "\\+?79[0-9]{9}";

    String[] components = data.split("\\s+");
    if (components.length != 4) {
      throw new ArrayIndexOutOfBoundsException();
    }
    String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
    if (!components[INDEX_EMAIL].matches(emailRegex)) {
      throw new IllegalArgumentException();
    }
    if (!components[INDEX_PHONE].matches(numberRegex)) {
      throw new IllegalArgumentException();
    }
    storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
  }

  public void listCustomers() {
    storage.values().forEach(System.out::println);
  }

  public void removeCustomer(String name) {
    if (storage.isEmpty()) {
      throw new ArrayIndexOutOfBoundsException();
    } else {
      storage.remove(name);
    }
  }

  public Customer getCustomer(String name) {
    return storage.get(name);
  }

  public int getCount() {
    return storage.size();
  }
}