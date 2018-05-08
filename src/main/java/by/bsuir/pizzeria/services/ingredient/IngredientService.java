package by.bsuir.pizzeria.services.ingredient;

import by.bsuir.pizzeria.beans.pizza.Ingredients;

import java.util.List;

public interface IngredientService {
    List<Ingredients> getAll();
    void addIngredient(Ingredients ingredients);
}
