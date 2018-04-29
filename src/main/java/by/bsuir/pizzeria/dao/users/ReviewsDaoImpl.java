package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Reviews;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewsDaoImpl extends AbstractDao<Long, Reviews> implements ReviewsDao {
}
