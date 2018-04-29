package by.bsuir.pizzeria.webComponent.drinkables;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.services.drinks.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class DrinkablesController {

    private DrinksService drinksService;

    @GetMapping("/drinks")
    public ResponseEntity getDrinkablesAll(){
        List<Drinkables> list = drinksService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @Autowired
    public void setDrinksService(DrinksService drinksService) {
        this.drinksService = drinksService;
    }
}
