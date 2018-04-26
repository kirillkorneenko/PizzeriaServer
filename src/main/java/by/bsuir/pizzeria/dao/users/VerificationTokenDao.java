package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Verificationtoken;

public interface VerificationTokenDao {
    void persist( Verificationtoken verificationToken);
    Verificationtoken getByKey(Long id);
    void update( Verificationtoken verificationToken);
    void delete( Verificationtoken verificationToken);
}
