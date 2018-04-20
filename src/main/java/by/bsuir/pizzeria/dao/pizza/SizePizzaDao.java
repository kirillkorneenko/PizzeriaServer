package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.SizePizza;

public interface SizePizzaDao {
    void persist( SizePizza sizePizza);
    SizePizza getByKey(Long id);
    void update( SizePizza sizePizza);
    void delete( SizePizza sizePizza);
}
