import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner output = new Scanner(System.in);
        String in = input.nextLine();
        String out = output.nextLine();

        FileUtils.copyFolder(in, out);
    }
}
