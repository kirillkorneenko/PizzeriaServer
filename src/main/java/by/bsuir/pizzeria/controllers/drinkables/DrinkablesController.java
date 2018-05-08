package by.bsuir.pizzeria.controllers.drinkables;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.services.drinks.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/drink{id}")
    public ResponseEntity deleteDrinks(@PathVariable String id){
        drinksService.deleteDrink(Long.parseLong(id));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/drink")
    public ResponseEntity addIngredient(@RequestBody Drinkables drinkables){
        drinksService.addDrink(drinkables);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setDrinksService(DrinksService drinksService) {
        this.drinksService = drinksService;
    }
}
