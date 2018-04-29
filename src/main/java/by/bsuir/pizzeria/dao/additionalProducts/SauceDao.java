package by.bsuir.pizzeria.dao.additionalProducts;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;

import java.util.List;

public interface SauceDao {

    void persist( Sauce sauce);
    Sauce getByKey(Long id);
    void update( Sauce sauce);
    void delete( Sauce sauce);
    List<Sauce> getAll();
}
