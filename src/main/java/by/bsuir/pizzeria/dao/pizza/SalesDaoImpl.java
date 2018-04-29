package by.bsuir.pizzeria.dao.pizza;

import by.bsuir.pizzeria.beans.pizza.Sales;
import by.bsuir.pizzeria.dao.AbstractDao;
import org.springframework.stereotype.Repository;

@Repository
public class SalesDaoImpl extends AbstractDao<Long, Sales> implements SalesDao {
}
