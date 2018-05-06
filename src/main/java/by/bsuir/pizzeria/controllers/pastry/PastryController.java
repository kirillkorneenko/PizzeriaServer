package by.bsuir.pizzeria.controllers.pastry;

import by.bsuir.pizzeria.beans.pizza.Pastry;
import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.services.pastry.PastryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class PastryController {

    private PastryService pastryService;

    @GetMapping("/pastry")
    public ResponseEntity getDrinkablesAll(){
        List<Pastry> list = pastryService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @Autowired
    public void setPastryService(PastryService pastryService) {
        this.pastryService = pastryService;
    }
}
