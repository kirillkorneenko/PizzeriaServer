package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Pastry;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PastryDaoImpl extends AbstractDao<Long, Pastry> implements PastryDao {

    @Override
    public List<Pastry> getAll() {
        List<Pastry> list = getEntityManager().createQuery("SELECT pastry FROM by.bsuir.pizzeria.beans.pizza.Pastry pastry").getResultList();
        return list;
    }
}
