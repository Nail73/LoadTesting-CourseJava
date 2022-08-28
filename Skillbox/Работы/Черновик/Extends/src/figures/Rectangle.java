package figures;

import java.time.LocalDate;

public class Rectangle extends Figure2D {

  private double width;
  private double height;

  private LocalDate creationTime;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
    setCreationTime();
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getSquare() {
    return width * height;
  }

  private void setCreationTime() {
    creationTime = LocalDate.now();
  }

  public LocalDate getCreationTime() {
    return creationTime;
  }

  @Override
  public double getVisibleHeight() {
    return 0;
  }

  @Override
  public double getVisibleWidth() {
    return 0;
  }
}
