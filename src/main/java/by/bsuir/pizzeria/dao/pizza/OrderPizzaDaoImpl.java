package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.order.OrderPizza;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderPizzaDaoImpl extends AbstractDao<Long, OrderPizza> implements OrderPizzaDao {
}
