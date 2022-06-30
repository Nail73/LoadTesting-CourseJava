public enum Color {
  WHITE("white"), BLACK("black"), RED("red"), GRAY("gray"), MULTICOLORED("multicolored");

  private String color;

  Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String newColor) {
    color = newColor;
  }

}

