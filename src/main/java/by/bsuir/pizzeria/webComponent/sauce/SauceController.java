package by.bsuir.pizzeria.webComponent.sauce;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.services.sauce.SauceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class SauceController {

    private SauceService sauceService;


    @GetMapping("/sauces")
    public ResponseEntity getSauceAll(){
        List<Sauce> list = sauceService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @Autowired
    public void setSauceService(SauceService sauceService) {
        this.sauceService = sauceService;
    }
}
