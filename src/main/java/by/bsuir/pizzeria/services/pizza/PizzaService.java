package by.bsuir.pizzeria.services.pizza;

import by.bsuir.pizzeria.beans.pizza.Pizza;
import by.bsuir.pizzeria.dto.order.PizzaDto;
import by.bsuir.pizzeria.dto.pizza.PizzaAddDto;

import java.util.List;

public interface PizzaService {
    List<Pizza> getAll();
    void deletePizza(Long id);
    void addPizza(PizzaAddDto pizzaDto);
}
