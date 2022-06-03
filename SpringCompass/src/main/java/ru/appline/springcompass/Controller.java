package ru.appline.springcompass;

import logic.CardinalModel;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {

    private static final CardinalModel cardinalModel = CardinalModel.getInstance();


    @PostMapping(value = "/create", consumes = "application/json")
    public String createCompass(@RequestBody Map<String, String> compassSide) {

        cardinalModel.add(compassSide);
        return "Компас успешно создан";
    }

    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public String getSide(@RequestBody Map<String, String> degree) {

        return cardinalModel.getSide(Integer.parseInt(degree.get("Degree")));
    }
}
