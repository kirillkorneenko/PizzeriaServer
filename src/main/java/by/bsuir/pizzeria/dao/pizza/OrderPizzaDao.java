package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.OrderPizza;

public interface OrderPizzaDao{
    void persist( OrderPizza orderPizza);
    OrderPizza getByKey(Long id);
    void update( OrderPizza orderPizza);
    void delete( OrderPizza orderPizza);
}
