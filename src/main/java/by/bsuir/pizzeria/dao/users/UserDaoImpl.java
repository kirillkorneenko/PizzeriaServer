package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {
    @Override
    public User getUserByPhone(String phone) {
        try{
            //**creating CriteriaBuilder**
            CriteriaBuilder builder = getCriteriaBuilder();
            CriteriaQuery<User> criteria = builder.createQuery(User.class);
            Root<User> userRoot = criteria.from(User.class);
            criteria.select(userRoot);

            //**Adding where clause**
            criteria.where(builder.equal(userRoot.get("phone"), phone));

            return getEntityManager().createQuery(criteria).getSingleResult();
        }

        catch (NoResultException nre){
            return null;
            }

    }
}
