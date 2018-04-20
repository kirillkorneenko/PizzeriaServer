package by.bsuir.pizzeria.webComponent;

import by.bsuir.pizzeria.dao.users.VerificationTokenDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    private VerificationTokenDao verificationTokenDao;

    @RequestMapping(value = { "/*", "/*/*" }, method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        String helo = new String("Welcome");
        return helo;
    }



}
