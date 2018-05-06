package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.order.Orders;

import java.util.List;

public interface OrderDao {
    void persist( Orders orders);
    Orders getByKey(Long id);
    void update( Orders orders);
    void delete( Orders orders);
    List<Orders> getAll();
}
