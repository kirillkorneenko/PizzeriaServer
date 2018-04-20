package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.OrderPizzaPastry;

public interface OrderPizzaPastryDao  {
    void persist( OrderPizzaPastry orderPizzaPastry);
    OrderPizzaPastry getByKey(Long id);
    void update( OrderPizzaPastry orderPizzaPastry);
    void delete( OrderPizzaPastry orderPizzaPastry);
}
