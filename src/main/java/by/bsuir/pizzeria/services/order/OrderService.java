package by.bsuir.pizzeria.services.order;

import by.bsuir.pizzeria.beans.order.Orders;
import by.bsuir.pizzeria.dto.order.OrderDto;

import java.util.List;

public interface OrderService {
    void addOrder(OrderDto orderDto);
    List<Orders> getAll();
    void confirmedOrder(Orders order);
     void paidForOrder(Orders order);
}
