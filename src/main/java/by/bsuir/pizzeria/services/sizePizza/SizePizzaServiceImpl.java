package by.bsuir.pizzeria.services.sizePizza;

import by.bsuir.pizzeria.beans.pizza.Sizepizza;
import by.bsuir.pizzeria.dao.pizza.SizePizzaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SizePizzaServiceImpl implements SizePizzaService {

    private SizePizzaDao sizePizzaDao;

    @Override
    public List<Sizepizza> getAll() {
        return sizePizzaDao.getAll();
    }

    @Autowired
    public void setSizePizzaDao(SizePizzaDao sizePizzaDao) {
        this.sizePizzaDao = sizePizzaDao;
    }
}
