package ru.appline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.cardinalDirectionsModel;

import java.util.Map;

@RestController
public class CompassController {
    private static final cardinalDirectionsModel CARDINAL_DIRECTIONS_MODEL = cardinalDirectionsModel.getInstance();


    @PostMapping(value = "/create", consumes = "application/json")
    public String createCompass(@RequestBody Map<String, String> compassSide) {

        CARDINAL_DIRECTIONS_MODEL.add(compassSide);
        return "Компас создан";
    }

    @GetMapping(value = "/get", consumes = "application/json", produces = "application/json")
    public String getSide(@RequestBody Map<String, String> degree) {

        return CARDINAL_DIRECTIONS_MODEL.getSide(Integer.parseInt(degree.get("Degree")));
    }
}