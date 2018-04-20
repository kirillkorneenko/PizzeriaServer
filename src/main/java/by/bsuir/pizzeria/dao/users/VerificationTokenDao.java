package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.beans.users.VerificationToken;

public interface VerificationTokenDao {
    void persist( VerificationToken verificationToken);
    User getByKey(Long id);
    void update( VerificationToken verificationToken);
    void delete( VerificationToken verificationToken);
}
