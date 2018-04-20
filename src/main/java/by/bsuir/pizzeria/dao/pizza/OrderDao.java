package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Order;

public interface OrderDao {
    void persist( Order order);
    Order getByKey(Long id);
    void update( Order order);
    void delete( Order order);
}
