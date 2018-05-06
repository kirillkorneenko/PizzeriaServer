package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.order.Orders;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl extends AbstractDao<Long, Orders> implements OrderDao {
    @Override
    public List<Orders> getAll() {
        List<Orders> list = getEntityManager().createQuery("SELECT orders FROM by.bsuir.pizzeria.beans.order.Orders orders").getResultList();
        return list;
    }
}
