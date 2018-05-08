package by.bsuir.pizzeria.services.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.beans.users.Verificationtoken;

public interface UserService {
    User registration(User user);
    User updateUser(User user);
    Boolean authorization(User user);
    User getUserByLogin(String login);
    Verificationtoken getCodeConfirmation(String code);
    void createVerificationToken(User user, String token);
}
