package by.bsuir.pizzeria.email;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.beans.users.VerificationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.UUID;

public class EmailSend {
    private JavaMailSender mailSender;

public void sendEmailForConfirmed(User user){
    String code = UUID.randomUUID().toString();
    VerificationToken verificationToken = new VerificationToken();
    verificationToken.setIdUser(user.getId());
    verificationToken.setToken(code);

    String email1User = user.getClientByIdUser().getEmail();
    String subject = "Регистрация выполнена";
    String links = "http://localhost:8080/verificationTokenDao.html?code=" + code;
    SimpleMailMessage email = new SimpleMailMessage();
    email.setTo(email1User);
    email.setSubject(subject);
    email.setText("Для того чтобы подтвердить регистрацию пройдите по ссылке - http://localhost:8080" + links);
    mailSender.send(email);
}

    @Autowired
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
}
