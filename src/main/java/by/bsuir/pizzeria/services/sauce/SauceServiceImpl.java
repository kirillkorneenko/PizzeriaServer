package by.bsuir.pizzeria.services.sauce;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;
import by.bsuir.pizzeria.dao.additionalProducts.SauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SauceServiceImpl implements SauceService {

    private SauceDao sauceDao;

    @Override
    @Transactional
    public List<Sauce> getAll() {
        return sauceDao.getAll();
    }

    @Override
    public void deleteSauce(Long id) {
        Sauce sauce = sauceDao.getByKey(id);
        sauceDao.delete(sauce);
    }

    @Override
    public void addSauce(Sauce sauce) {
        sauceDao.persist(sauce);
    }

    @Autowired
    public void setSauceDao(SauceDao sauceDao) {
        this.sauceDao = sauceDao;
    }
}
