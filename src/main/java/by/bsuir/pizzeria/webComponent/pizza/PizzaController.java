package by.bsuir.pizzeria.webComponent.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.services.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    public void setPizzaService(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }
}
