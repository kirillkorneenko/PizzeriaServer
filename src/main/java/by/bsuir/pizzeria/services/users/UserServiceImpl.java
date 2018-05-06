package by.bsuir.pizzeria.services.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.dao.users.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void registration(User user) {
        user.setConfirmation("false");
        user.setIdRole(1L);
        userDao.persist(user);
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
