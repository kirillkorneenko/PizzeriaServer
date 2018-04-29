package by.bsuir.pizzeria.dao.additionalProducts;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SauceDaoImpl extends AbstractDao<Long, Sauce> implements SauceDao {

    @Override
    public List<Sauce> getAll() {
        List<Sauce> list = getEntityManager().createQuery("SELECT sause FROM by.bsuir.pizzeria.beans.additionalProducts.Sauce sause").getResultList();
        return list;
    }
}
