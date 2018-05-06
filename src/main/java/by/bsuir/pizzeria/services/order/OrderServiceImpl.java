package by.bsuir.pizzeria.services.order;

import by.bsuir.pizzeria.beans.order.OrderPizza;
import by.bsuir.pizzeria.beans.order.Orders;
import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.beans.users.User;
import by.bsuir.pizzeria.dao.pizza.OrderDao;
import by.bsuir.pizzeria.dao.pizza.OrderPizzaDao;
import by.bsuir.pizzeria.dao.users.UserDao;
import by.bsuir.pizzeria.dto.order.OrderDto;
import by.bsuir.pizzeria.dto.order.PizzaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;
    private UserDao userDao;
    private OrderPizzaDao orderPizzaDao;

    @Override
    @Transactional
    public void addOrder(OrderDto orderDto) {
        User user =userDao.getUserByPhone(orderDto.getPhone());
        if(user== null){
            user = new User();
            user.setName(orderDto.getName());
            user.setSurname(orderDto.getSurname());
            user.setPhone(orderDto.getPhone());
            user.setConfirmation("false");
            user.setLogin("null");
            user.setPassword("null");
            user.setEmail("null");
            user.setIdRole(1L);
            userDao.persist(user);
        }

        Orders order = new Orders();
        order.setComment(orderDto.getComment());
        order.setTotalPrice(Double.parseDouble(orderDto.getTotalCost()));
        order.setIdClient(user.getId());
        order.setOrderTime(Timestamp.valueOf(LocalDateTime.now()));
        order.setIdPizzeria(orderDto.getAddress().getId());
        order.setConfirmed("false");
        order.setPaidFor("false");
        orderDao.persist(order);

        for (PizzaDto pizza :
                orderDto.getPizzaList()) {
            OrderPizza orderPizza = new OrderPizza();
            orderPizza.setIdOrder(order.getId());
            orderPizza.setIdPastry(pizza.getPastry().getId());
            orderPizza.setIdPizza(pizza.getId());
            orderPizza.setIdSizePizza(pizza.getSize().getId());
            orderPizzaDao.persist(orderPizza);
        }

        order.setDrinkables(orderDto.getDrinksList());
        order.setSauces(orderDto.getSauceList());
    }

    @Override
    public List<Orders> getAll() {
        return orderDao.getAll();
    }

    @Override
    public void confirmedOrder(Orders order) {
        order.setConfirmed("true");
        orderDao.update(order);
    }

    @Override
    public void paidForOrder(Orders order) {
        order.setPaidFor("true");
        orderDao.update(order);
    }

    @Autowired
    public void setOrderPizzaDao(OrderPizzaDao orderPizzaDao) {
        this.orderPizzaDao = orderPizzaDao;
    }

    @Autowired
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
