import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailList {

  Set<String> sortedEmails = new TreeSet<>();

  public void add(String email) {
    Pattern VALID_EMAIL_ADDRESS_REGEX =
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
    if (matcher.find()) {
      sortedEmails.add(email.toLowerCase());
    } else {
      System.out.println("Неверный формат email");
    }
  }
  public List<String> getSortedEmails() {
    return new ArrayList<>(sortedEmails);
  }
}
