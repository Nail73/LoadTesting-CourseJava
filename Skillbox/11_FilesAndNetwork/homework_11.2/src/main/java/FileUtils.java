import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileUtils extends SimpleFileVisitor<String> {

  public static void copyFolder(String sourceDirectory, String destinationDirectory) {

    Path srcDir = Paths.get(sourceDirectory);
    Path dstDir = Paths.get(destinationDirectory);
    try {
      Files.walkFileTree(srcDir, new SimpleFileVisitor<>() {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
          Path dstSubDir = dstDir.resolve(srcDir.relativize(dir));
          Files.createDirectories(dstSubDir);
          return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
          Path dstFile = dstDir.resolve(srcDir.relativize(file));
          Files.copy(file, dstFile);
          return FileVisitResult.CONTINUE;
        }
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}


