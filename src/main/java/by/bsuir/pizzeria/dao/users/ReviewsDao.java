package by.bsuir.pizzeria.dao.users;

import by.bsuir.pizzeria.beans.users.Reviews;

public interface ReviewsDao {
    void persist( Reviews reviews);
    Reviews getByKey(Long id);
    void update( Reviews reviews);
    void delete( Reviews reviews);
}
