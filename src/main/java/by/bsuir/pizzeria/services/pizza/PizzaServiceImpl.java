package by.bsuir.pizzeria.services.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.dao.pizza.PizzaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService{

    private PizzaDao pizzaDao;

    @Override
    public List<Pizza> getAll() {
        return pizzaDao.getAll();
    }

    @Autowired
    public void setPizzaDao(PizzaDao pizzaDao) {
        this.pizzaDao = pizzaDao;
    }
}
