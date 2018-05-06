package by.bsuir.pizzeria.controllers.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class UsersController {

    private UserService userService;

    @PostMapping("/registration")
    public ResponseEntity registration(@RequestBody User user){
        userService.registration(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
