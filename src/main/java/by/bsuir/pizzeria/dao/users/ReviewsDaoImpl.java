package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Reviews;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewsDaoImpl extends AbstractDao<Long, Reviews> implements ReviewsDao {
    @Override
    public List<Reviews> getAll() {
        List<Reviews> list = getEntityManager().createQuery("SELECT reviews FROM by.bsuir.pizzeria.beans.users.Reviews reviews").getResultList();
        return list;
    }
}
