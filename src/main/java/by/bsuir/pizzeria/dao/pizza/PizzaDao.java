package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizza;

import java.util.List;

public interface PizzaDao {
    void persist( Pizza pizza);
    Pizza getByKey(Long id);
    void update( Pizza pizza);
    void delete( Pizza pizza);
    List<Pizza> getAll();
}
