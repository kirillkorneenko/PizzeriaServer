package by.bsuir.pizzeria.dao.additionalProducts;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;

import java.util.List;

public interface DrinkablesDao {
    void persist(Drinkables drinkables);
    Drinkables getByKey(Long id);
    void update(Drinkables drinkables);
    void delete(Drinkables drinkables);
    List<Drinkables> getAll();
}
