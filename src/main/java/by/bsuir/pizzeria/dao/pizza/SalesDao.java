package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Sales;

public interface SalesDao {
    void persist( Sales sales);
    Sales getByKey(Long id);
    void update( Sales sales);
    void delete( Sales sales);
}
