package by.bsuir.pizzeria.services.drinks;

import by.bsuir.pizzeria.beans.additionalProducts.Drinkables;
import by.bsuir.pizzeria.dao.additionalProducts.DrinkablesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrinksServiceImpl implements DrinksService {

    private DrinkablesDao drinkablesDao;

    @Override
    @Transactional
    public List<Drinkables> getAll() {
        return drinkablesDao.getAll();
    }

    @Override
    public void deleteDrink(Long id) {
        Drinkables drinkables = drinkablesDao.getByKey(id);
        drinkablesDao.delete(drinkables);
    }

    @Autowired
    public void setDrinkablesDao(DrinkablesDao drinkablesDao) {
        this.drinkablesDao = drinkablesDao;
    }
}
