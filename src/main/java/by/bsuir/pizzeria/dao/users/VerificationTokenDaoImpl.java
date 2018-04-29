package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Verificationtoken;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class VerificationTokenDaoImpl extends AbstractDao<Long, Verificationtoken> implements VerificationTokenDao {
}
