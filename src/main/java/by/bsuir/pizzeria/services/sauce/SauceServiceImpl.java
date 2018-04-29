package by.bsuir.pizzeria.services.sauce;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.dao.additionalProducts.SauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SauceServiceImpl implements SauceService {

    private SauceDao sauceDao;

    @Override
    public List<Sauce> getAll() {
        return sauceDao.getAll();
    }


    @Autowired
    public void setSauceDao(SauceDao sauceDao) {
        this.sauceDao = sauceDao;
    }
}
