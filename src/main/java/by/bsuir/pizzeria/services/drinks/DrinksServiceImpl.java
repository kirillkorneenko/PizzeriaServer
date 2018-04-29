package by.bsuir.pizzeria.services.drinks;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.dao.additionalProducts.DrinkablesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinksServiceImpl implements DrinksService {

    private DrinkablesDao drinkablesDao;

    @Override
    public List<Drinkables> getAll() {
        return drinkablesDao.getAll();
    }

    @Autowired
    public void setDrinkablesDao(DrinkablesDao drinkablesDao) {
        this.drinkablesDao = drinkablesDao;
    }
}
