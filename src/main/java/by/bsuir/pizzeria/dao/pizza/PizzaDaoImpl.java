package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzaDaoImpl extends AbstractDao<Long, Pizza> implements PizzaDao {

    @Override
    public List<Pizza> getAll() {
        List<Pizza> list = getEntityManager().createQuery("SELECT pizza FROM by.bsuir.pizzeria.beans.pizza.Pizza pizza").getResultList();
        return list;
    }
}
