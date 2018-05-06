package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizzeria;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzeriaDaoImpl extends AbstractDao<Long, Pizzeria> implements PizzeriaDao {

    @Override
    public List<Pizzeria> getAll() {
        List<Pizzeria> list = getEntityManager().createQuery("SELECT pizzeria FROM by.bsuir.pizzeria.beans.pizza.Pizzeria pizzeria").getResultList();
        return list;
    }
}
