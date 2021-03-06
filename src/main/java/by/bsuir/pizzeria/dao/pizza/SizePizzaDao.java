package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Sizepizza;

import java.util.List;

public interface SizePizzaDao {
    void persist( Sizepizza sizePizza);
    Sizepizza getByKey(Long id);
    void update( Sizepizza sizePizza);
    void delete( Sizepizza sizePizza);
    List<Sizepizza> getAll();
}
