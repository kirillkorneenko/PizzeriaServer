package by.bsuir.pizzeria.services.sauce;

import by.bsuir.pizzeria.beans.additionalProducts.Sauce;

import java.util.List;

public interface SauceService {
     List<Sauce> getAll();
     void deleteSauce(Long id);
     void addSauce(Sauce sauce);
}
