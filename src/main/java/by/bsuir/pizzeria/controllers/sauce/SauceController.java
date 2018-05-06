package by.bsuir.pizzeria.controllers.sauce;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.services.sauce.SauceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/sauce{id}")
    public ResponseEntity deleteSauce(@PathVariable String id){
        sauceService.deleteSauce(Long.parseLong(id));
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setSauceService(SauceService sauceService) {
        this.sauceService = sauceService;
    }
}
