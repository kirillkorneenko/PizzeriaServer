package by.bsuir.pizzeria.services.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.beans.users.Verificationtoken;
import by.bsuir.pizzeria.dao.users.UserDao;
import by.bsuir.pizzeria.dao.users.VerificationTokenDao;
import by.bsuir.pizzeria.encryption.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private VerificationTokenDao verificationTokenDao;

    @Override
    @Transactional
    public User registration(User user) {
        User u = userDao.getUserByPhone(user.getPhone());
        if(u==null){
        user.setConfirmation("false");
        user.setIdRole(1L);
        user.setPassword(MD5.getHash(user.getPassword()));
        userDao.persist(user);
        return user;
        }
        else{
            u.setLogin(user.getLogin());
            u.setPassword(MD5.getHash(user.getPassword()));
            u.setEmail(user.getEmail());
            return u;
        }
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        userDao.update(user);
        return userDao.getUserByLogin(user.getLogin());
    }

    @Override
    @Transactional
    public Boolean authorization(User user) {
        User userAut = userDao.getUserByLogin(user.getLogin());
        if(userAut==null){
            return false;
        }else
        {
            if(userAut.getPassword().equals(MD5.getHash(user.getPassword())) && Boolean.valueOf(userAut.getConfirmation())){
                return true;
            }
            else return false;
        }
    }

    @Override
    @Transactional
    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }

    @Override
    public Verificationtoken getCodeConfirmation(String code) {
        return verificationTokenDao.getByCode(code);
    }

    @Override
    public void createVerificationToken(User user, String token) {
        Verificationtoken verificationToken = new Verificationtoken();
        verificationToken.setToken(token);
        User u =userDao.getUserByLogin(user.getLogin());
        verificationToken.setUserById(u);
        verificationToken.setId(u.getId());
        verificationTokenDao.persist(verificationToken);
    }

    @Autowired
    public void setVerificationTokenDao(VerificationTokenDao verificationTokenDao) {
        this.verificationTokenDao = verificationTokenDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
