import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/skillbox";
    String name = "root";
    String pass = "7753191";

    try {
      Connection connection = DriverManager.getConnection(url, name, pass);
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(
          "SELECT course_name, COUNT(*) / (MAX(month(subscription_date)) - MIN(month(subscription_date)) + 1) AS avg FROM PurchaseList WHERE YEAR (subscription_date) = 2018 GROUP BY course_name ORDER BY avg DESC, course_name;");
      while (resultSet.next()) {
        String courseName = resultSet.getString("course_name");
        String avgValue = resultSet.getString("avg");
        System.out.println(courseName + " - " + avgValue);
      }
      resultSet.close();
      statement.close();
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
