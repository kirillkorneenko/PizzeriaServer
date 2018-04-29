package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {
}
