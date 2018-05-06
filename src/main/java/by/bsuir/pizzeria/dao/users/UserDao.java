package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.User;

public interface UserDao {
    void persist( User user);
    User getByKey(Long id);
    void update( User user);
    void delete( User user);
    User getUserByPhone(String phone);
}
