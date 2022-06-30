import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring {

  public static void main(String[] args) {
    String str = "helloslkhellodjladfjhello";
    String findStr = "hello";
    int lastIndex = 0;
    List<Integer> result = new ArrayList<Integer>();

    while(lastIndex != -1) {

      lastIndex = str.indexOf(findStr,lastIndex);

      if(lastIndex != -1){
        result.add(lastIndex);
        lastIndex += 1;
      }
    }
    System.out.println(lastIndex);
  }
}
