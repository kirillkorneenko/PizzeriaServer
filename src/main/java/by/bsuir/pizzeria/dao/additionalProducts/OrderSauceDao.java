package by.bsuir.pizzeria.dao.additionalProducts;

import by.bsuir.pizzeria.beans.additionalProducts.OrderSauce;
import by.bsuir.pizzeria.beans.pizza.Order;

public interface OrderSauceDao {

    void persist( OrderSauce orderSauce);
    OrderSauce getByKey(Long id);
    void update( OrderSauce orderSauce);
    void delete( OrderSauce orderSauce);
}
