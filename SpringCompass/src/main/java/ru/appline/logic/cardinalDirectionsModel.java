package ru.appline.logic;

import java.util.*;
import java.io.Serializable;

public class cardinalDirectionsModel implements Serializable {
    private static final cardinalDirectionsModel instance = new cardinalDirectionsModel();

    private final Set<cardinalDirections> model;

    public cardinalDirectionsModel() {
        model = new HashSet<>();
    }

    public static cardinalDirectionsModel getInstance() {
        return instance;
    }

    public void add(Map<String, String> compassSide) {
        compassSide.forEach((side, degree) -> {
            String[] arrayDegree = degree.split("-");
            double leftBorder = Double.parseDouble(arrayDegree[0]);
            double rightBorder = Double.parseDouble(arrayDegree[1]);

            cardinalDirections newCardinalDirections = new cardinalDirections(side, leftBorder, rightBorder);
            model.add(newCardinalDirections);
        });
    }

    public String getSide(int value) {
        String nameSide = model.stream().filter(degree -> {
            boolean isNorthSide = (value >= degree.getLeftBorder()) && (value <= 360) ||
                    (value >= 0) && (value <= degree.getRightBorder());

            boolean isSide = (value >= degree.getLeftBorder()) &&
                            (value <= degree.getRightBorder());

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
