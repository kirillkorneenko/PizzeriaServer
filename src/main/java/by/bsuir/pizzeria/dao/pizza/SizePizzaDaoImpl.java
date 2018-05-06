package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Sizepizza;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SizePizzaDaoImpl extends AbstractDao<Long, Sizepizza> implements SizePizzaDao {

    @Override
    public List<Sizepizza> getAll() {
        List<Sizepizza> list = getEntityManager().createQuery("SELECT sizepizza FROM by.bsuir.pizzeria.beans.pizza.Sizepizza sizepizza").getResultList();
        return list;
    }
}
