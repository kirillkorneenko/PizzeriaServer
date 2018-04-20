package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Ingredients;

public interface IngredientsDao {
    void persist( Ingredients ingredients);
    Ingredients getByKey(Long id);
    void update( Ingredients ingredients);
    void delete( Ingredients ingredients);
}
