package by.bsuir.pizzeria.controllers.contacts;

import by.bsuir.pizzeria.beans.pizza.Pizzeria;
import by.bsuir.pizzeria.services.contacts.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ContactsController {

    private ContactsService contactsService;

    @GetMapping("/contacts")
    public ResponseEntity getDrinkablesAll(){
        List<Pizzeria> list = contactsService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @Autowired
    public void setContactsService(ContactsService contactsService) {
        this.contactsService = contactsService;
    }
}
