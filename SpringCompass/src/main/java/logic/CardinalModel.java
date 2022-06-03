package logic;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CardinalModel implements Serializable {

    private static final CardinalModel instance = new CardinalModel();

    private final Set<CardinalDirections> model;

    public CardinalModel() {
        model = new HashSet<>();
    }
    public static CardinalModel getInstance() {
        return instance;
    }
    public void add(Map<String, String> compassCardinal) {
        compassCardinal.forEach((side, degree) -> {
            String[] arrayDegree = degree.split("-");
            double leftSide = Double.parseDouble(arrayDegree[0]);
            double rightSide = Double.parseDouble(arrayDegree[1]);
            CardinalDirections newSide = new CardinalDirections(side, leftSide, rightSide);
            model.add(newSide);
        });
    }
    public String getSide(int value) {
        String nameSide = model.stream().filter(degree -> {
                    boolean isNorthSide = (value >= degree.getLeftSide()) && (value <= 360) ||
                            (value >= 0) && (value <= degree.getRightSide());

                    boolean isSide = (value >= degree.getLeftSide()) &&
                            (value <= degree.getRightSide());

                    if (isNorthSide) {
                        boolean isNorth = degree.getName().equalsIgnoreCase("North");

                        if (isNorth) {
                            return true;
                        } else if (isSide) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (isSide) {
                        return true;
                    } else {
                        return false;
                    }
                }).findFirst()
                .get()
                .getName();

        return  "{\n\"Side\" : \"" + nameSide + "\"\n}";
    }




}
