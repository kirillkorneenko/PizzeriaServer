package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Orders;

public interface OrderDao {
    void persist( Orders orders);
    Orders getByKey(Long id);
    void update( Orders orders);
    void delete( Orders orders);
}
