package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Pastry;

public interface PastryDao {
    void persist( Pastry pastry);
    Pastry getByKey(Long id);
    void update( Pastry pastry);
    void delete( Pastry pastry);
}
