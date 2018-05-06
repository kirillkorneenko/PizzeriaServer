package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizzeria;

import java.util.List;

public interface PizzeriaDao {
    void persist( Pizzeria pizzeria);
    Pizzeria getByKey(Long id);
    void update( Pizzeria pizzeria);
    void delete( Pizzeria pizzeria);
    List<Pizzeria> getAll();
}
