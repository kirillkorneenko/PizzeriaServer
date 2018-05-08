package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Ingredients;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IngredientsDaoImpl extends AbstractDao<Long, Ingredients> implements IngredientsDao {
    @Override
    public List<Ingredients> getAll() {
        List<Ingredients> list = getEntityManager().createQuery("SELECT ingredients FROM by.bsuir.pizzeria.beans.pizza.Ingredients ingredients").getResultList();
        return list;
    }
}
