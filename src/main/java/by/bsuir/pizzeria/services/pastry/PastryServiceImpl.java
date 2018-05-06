package by.bsuir.pizzeria.services.pastry;


import by.bsuir.pizzeria.beans.pizza.Pastry;
import by.bsuir.pizzeria.dao.pizza.PastryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PastryServiceImpl implements PastryService {

    private PastryDao pastryDao;

    @Override
    @Transactional
    public List<Pastry> getAll() {
        return pastryDao.getAll();
    }

    @Autowired
    public void setPastryDao(PastryDao pastryDao) {
        this.pastryDao = pastryDao;
    }
}
