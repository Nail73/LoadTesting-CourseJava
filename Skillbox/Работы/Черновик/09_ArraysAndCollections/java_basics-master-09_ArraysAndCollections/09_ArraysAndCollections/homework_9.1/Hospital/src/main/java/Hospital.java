import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    float[] temperatureData = new float[patientsCount];
    for (int i = 0; i < temperatureData.length; i++) {
      float result = (float) (32 + (Math.random() * 8));
      temperatureData[i] = result;
    }
    return temperatureData;
  }

  public static String getReport(float[] temperatureData) {

    DecimalFormat decimalFormat = new DecimalFormat("#.#");
    DecimalFormat decimalFormat2 = new DecimalFormat("#.##");
    float averageTemperature;
    float generalTemperature = 0;
    int count = 0;

    StringBuilder builder = new StringBuilder();

    float[] newTemperatureDate = Arrays.copyOf(temperatureData, temperatureData.length);
    for (float temp : newTemperatureDate) {

      if (temp > 36.1 && temp < 37) {
        count++;
      }
      generalTemperature += temp;
      builder.append(decimalFormat.format(temp)).append(" ");
    }
    averageTemperature = generalTemperature / newTemperatureDate.length;

    return "Температуры пациентов: " + builder.toString().trim() +
        "\nСредняя температура: " + decimalFormat2.format(averageTemperature) +
        "\nКоличество здоровых: " + count;
  }
}



