package by.bsuir.pizzeria.services.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.dao.pizza.PizzaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PizzaServiceImpl implements PizzaService{

    private PizzaDao pizzaDao;

    @Override
    @Transactional
    public List<Pizza> getAll() {
        return pizzaDao.getAll();
    }

    @Override
    public void deletePizza(Long id) {
        Pizza pizza = pizzaDao.getByKey(id);
        pizzaDao.delete(pizza);
    }

    @Autowired
    public void setPizzaDao(PizzaDao pizzaDao) {
        this.pizzaDao = pizzaDao;
    }
}
