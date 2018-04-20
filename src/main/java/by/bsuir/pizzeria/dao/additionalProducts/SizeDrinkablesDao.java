package by.bsuir.pizzeria.dao.additionalProducts;


import by.bsuir.pizzeria.beans.additionalProducts.Sizedrinkables;

public interface SizeDrinkablesDao {
    void persist( Sizedrinkables sizedrinkables);
    Sizedrinkables getByKey(Long id);
    void update( Sizedrinkables sizedrinkables);
    void delete( Sizedrinkables sizedrinkables);
}
