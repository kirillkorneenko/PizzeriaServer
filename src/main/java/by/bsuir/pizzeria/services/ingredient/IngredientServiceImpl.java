package by.bsuir.pizzeria.services.ingredient;

import by.bsuir.pizzeria.beans.pizza.Ingredients;
import by.bsuir.pizzeria.dao.pizza.IngredientsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IngredientServiceImpl implements IngredientService {

    private IngredientsDao ingredientsDao;

    @Override
    @Transactional
    public List<Ingredients> getAll() {
        return ingredientsDao.getAll();
    }

    @Override
    @Transactional
    public void addIngredient(Ingredients ingredients) {
        ingredientsDao.persist(ingredients);
    }

    @Autowired
    public void setIngredientsDao(IngredientsDao ingredientsDao) {
        this.ingredientsDao = ingredientsDao;
    }
}
