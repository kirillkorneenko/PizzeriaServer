package by.bsuir.pizzeria.controllers.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.beans.users.Verificationtoken;
import by.bsuir.pizzeria.email.EmailSend;
import by.bsuir.pizzeria.email.OnRegistrationCompleteEvent;
import by.bsuir.pizzeria.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class UsersController {
    private ApplicationEventPublisher eventPublisher;
    private UserService userService;

    @PostMapping("/registration")
    public ResponseEntity registration(@RequestBody User user){
        User u =userService.registration(user);
        eventPublisher.publishEvent(new OnRegistrationCompleteEvent(u));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/authorization")
    public ResponseEntity authorization(@RequestBody User user){
        if(userService.authorization(user)){
            return ResponseEntity.ok(userService.getUserByLogin(user.getLogin()));
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/user{login}")
    public ResponseEntity getUser(@PathVariable String login){
        User user = userService.getUserByLogin(login);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/verificationTokenDao{code}")
    public String confirmationOfRegistartion(@PathVariable String code){
        Verificationtoken verificationtoken = userService.getCodeConfirmation(code);
        User user = verificationtoken.getUserById();
        user.setConfirmation("true");
        userService.updateUser(user);
        return "Регистрация прошла успешно пройдите по ссылке - http://localhost:4200/";
    }



    @Autowired
    public void setEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
