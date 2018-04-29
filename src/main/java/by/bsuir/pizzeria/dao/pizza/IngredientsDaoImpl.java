package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Ingredients;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class IngredientsDaoImpl extends AbstractDao<Long, Ingredients> implements IngredientsDao {
}
