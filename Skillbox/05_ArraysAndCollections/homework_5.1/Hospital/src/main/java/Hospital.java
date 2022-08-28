import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Hospital {

  public static final int MIN_TEMP = 32;
  public static final int MAX_TEMP = 40;
  public static final double MIN_TEMP_HEALTHY = 36.2;
  public static final double MAX_TEMP_HEALTHY = 36.9;


  public static float[] generatePatientsTemperatures(int PATIENTS_COUNT) {

    float[] temperatureData = new float[PATIENTS_COUNT];
    for (int i = 0; i < temperatureData.length; i++) {
      temperatureData[i] = ((float) Math.random() * (MAX_TEMP - MIN_TEMP) + MIN_TEMP);

    }
    return temperatureData;
  }

  public static String getReport(float[] temperatureData) {

    DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
    otherSymbols.setDecimalSeparator('.');
    DecimalFormat decimalFormat1 = new DecimalFormat("#.#", otherSymbols);

    float average = 0;
    for (int i = 0; i < temperatureData.length; i++) {
      average += Float.parseFloat(String.valueOf(temperatureData[i]));
    }
    average /= temperatureData.length;

    int healthyCount = 1;
    for (int i = 0; i < temperatureData.length; i++) {
      if (temperatureData[i] <= MAX_TEMP_HEALTHY && temperatureData[i] >= MIN_TEMP_HEALTHY) {
        healthyCount++;
      }
    }
    String report = "";

    for (int i = 0; i < temperatureData.length; i++) {
      BigDecimal bigDecimal = new BigDecimal(temperatureData[i]);
      report += bigDecimal.setScale(1, RoundingMode.HALF_EVEN) + " ";
    }

    return "Температуры пациентов: " + report.trim()
        + "\nСредняя температура: " + decimalFormat1.format(average)
        + "\nКоличество здоровых: " + healthyCount;
  }
}


