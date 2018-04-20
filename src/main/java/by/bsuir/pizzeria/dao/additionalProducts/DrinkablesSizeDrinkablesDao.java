package by.bsuir.pizzeria.dao.additionalProducts;

import by.bsuir.pizzeria.beans.additionalProducts.DrinkablesSizedrinkables;

public interface DrinkablesSizeDrinkablesDao {
    void persist( DrinkablesSizedrinkables drinkablesSizedrinkables);
    DrinkablesSizedrinkables getByKey(Long id);
    void update( DrinkablesSizedrinkables drinkablesSizedrinkables);
    void delete( DrinkablesSizedrinkables drinkablesSizedrinkables);
}
