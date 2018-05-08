package by.bsuir.pizzeria.controllers.pizza;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.dto.order.PizzaDto;
import by.bsuir.pizzeria.dto.pizza.PizzaAddDto;
import by.bsuir.pizzeria.services.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class PizzaController {

    private PizzaService pizzaService;

    @GetMapping("/pizzas")
    public ResponseEntity getDrinkablesAll(){
        List<Pizza> list = pizzaService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping("/pizza{id}")
    public ResponseEntity deletePizza(@PathVariable String id){
        pizzaService.deletePizza(Long.parseLong(id));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/pizza")
    public ResponseEntity addIngredient(@RequestBody PizzaAddDto pizzaAddDto){
        pizzaService.addPizza(pizzaAddDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setPizzaService(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }
}
