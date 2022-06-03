package logic;

public class CardinalDirections {
    private String name;
    private double leftSide;
    private double rightSide;

    public CardinalDirections(String name, double leftSide, double rightSide) {
        this.name = name;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        this.rightSide = rightSide;
    }
}
