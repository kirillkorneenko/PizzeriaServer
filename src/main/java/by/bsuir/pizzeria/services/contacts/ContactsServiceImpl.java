package by.bsuir.pizzeria.services.contacts;

import by.bsuir.pizzeria.beans.pizza.Pizzeria;
import by.bsuir.pizzeria.dao.pizza.PizzeriaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactsServiceImpl implements ContactsService {
    private PizzeriaDao pizzeriaDao;

    @Override
    @Transactional
    public List<Pizzeria> getAll() {
        return pizzeriaDao.getAll();
    }

    @Autowired
    public void setPizzeriaDao(PizzeriaDao pizzeriaDao) {
        this.pizzeriaDao = pizzeriaDao;
    }
}
