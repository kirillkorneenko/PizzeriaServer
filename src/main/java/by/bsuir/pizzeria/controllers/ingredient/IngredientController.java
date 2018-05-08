package by.bsuir.pizzeria.controllers.ingredient;

import by.bsuir.pizzeria.beans.pizza.Ingredients;
import by.bsuir.pizzeria.services.ingredient.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class IngredientController {

    private IngredientService ingredientService;

    @GetMapping("/ingredient")
    public ResponseEntity getIngredientsAll(){
        List<Ingredients> list = ingredientService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/ingredient")
    public ResponseEntity addIngredient(@RequestBody Ingredients ingredients){
        ingredientService.addIngredient(ingredients);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
}
