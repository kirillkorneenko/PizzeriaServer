package by.bsuir.pizzeria.email;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.beans.users.Verificationtoken;
import by.bsuir.pizzeria.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EmailSend implements
        ApplicationListener<OnRegistrationCompleteEvent> {

    private UserService userService;
    private JavaMailSender mailSender;

public void sendEmailForConfirmed(OnRegistrationCompleteEvent event){
    String code = UUID.randomUUID().toString();
    userService.createVerificationToken(event.getUser(), code);

    String email1User = event.getUser().getEmail();
    String subject = "Регистрация выполнена";
    String links = "http://localhost:8080/verificationTokenDao" + code;
    SimpleMailMessage email = new SimpleMailMessage();
    email.setTo(email1User);
    email.setSubject(subject);
    email.setText("Для того чтобы подтвердить регистрацию пройдите по ссылке - " + links);
    mailSender.send(email);
}

@Override
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
        this.sendEmailForConfirmed(event);
    }


    @Autowired
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
