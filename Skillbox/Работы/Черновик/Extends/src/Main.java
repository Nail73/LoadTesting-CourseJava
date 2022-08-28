import figures.Circle;
import figures.Figure;
import figures.Figure2D;
import figures.Rectangle;
import figures.Square;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    Square square = new Square(40);
    System.out.println(square.getSquare());
    System.out.println(square.getCreationTime());

    Figure2D circle = new Circle(45.6);
    System.out.println(circle.getSquare());

    Figure figure = getNextFigure();
    figure.getVisibleHeight();

    ArrayList<Figure> squares = new ArrayList<>();
    squares.add(new Circle(45));
    squares.add(new Square(23));
    for (Figure figure1 : squares) {
      System.out.println(figure1.getVisibleWidth());
    }
    TreeSet<Square> squares1 = new TreeSet<>();
    squares1.add(new Square(50));
    squares1.add(new Square(60));
    squares1.add(new Square(10));
    squares1.add(new Square(50));
    squares1.add(new Square(20));
    squares1.add(new Square(60));

    for (Square square1 : squares1) {
      System.out.println(square1.getWidth());
    }

    System.out.println();

    TreeSet<Square> squares2 = new TreeSet<>(new SquareComparator());
    squares2.add(new Square(60));
    squares2.add(new Square(70));
    squares2.add(new Square(20));
    squares2.add(new Square(30));
    squares2.add(new Square(30));
    squares2.add(new Square(55));

    for (Square square2 : squares2) {
      System.out.println(square2.getWidth());
    }
    System.out.println();

    TreeSet<Square> squares3 = new TreeSet<>(Comparator.comparingDouble(Rectangle::getWidth)
    );
    squares3.add(new Square(60));
    squares3.add(new Square(70));
    squares3.add(new Square(20));
    squares3.add(new Square(30));
    squares3.add(new Square(30));
    squares3.add(new Square(55));

    for (Square square3 : squares3) {
      System.out.println(square3.getWidth());
    }
  }


  public static Figure getNextFigure() {
    return new Circle(67);
  }
}
