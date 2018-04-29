package by.bsuir.pizzeria.dao.additionalProducts;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrinkablesDaoImpl extends AbstractDao<Long, Drinkables> implements DrinkablesDao {
    @Override
    public List<Drinkables> getAll() {
        List<Drinkables> list = getEntityManager().createQuery("SELECT drinkables FROM by.bsuir.pizzeria.beans.additionalProducts.Drinkables drinkables").getResultList();
        return list;
    }
}
