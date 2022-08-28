import java.io.File;

public class ParametresBag {

  private long limit;
  private String path;

  public ParametresBag(String[] args) throws IllegalAccessException {

    if(args.length != 4){
      throw new IllegalAccessException("Укажите 2 параметра: -l (лимит по объему) и -d (путь к папке)");
    }
    limit = 0;
    path = "";
    for(int i = 0; i < 4; i = i + 2){
      if(args[i].equals("-l")){
        limit = SizeCalculator.getSizeFromHumanReadable(args[i + 1]);
      } else if(args[i].equals("-d")){
        path = args[i + 1];
      }
    }
    if(limit <= 0){
      throw new IllegalAccessException("Лимит не указан или указан не верно");
    }
    File folder = new File(path);
    if(!folder.exists() || !folder.isDirectory()){
      throw new IllegalAccessException("Путь к папке не указан или указан неверно");
    }
  }

  public String getPath() {
    return "";
  }

  public long getLimit() {
    return 0;
  }
}
