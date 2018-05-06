package by.bsuir.pizzeria.controllers.sizePizza;

import by.bsuir.pizzeria.beans.pizza.Sizepizza;
import by.bsuir.pizzeria.services.sizePizza.SizePizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class SizePizzaController {

    private SizePizzaService sizePizzaService;

    @GetMapping("/sizepizza")
    public ResponseEntity getSizeAll(){
        List<Sizepizza> list = sizePizzaService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @Autowired
    public void setSizePizzaService(SizePizzaService sizePizzaService) {
        this.sizePizzaService = sizePizzaService;
    }
}
