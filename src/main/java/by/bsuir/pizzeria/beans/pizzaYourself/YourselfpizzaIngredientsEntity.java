package by.bsuir.pizzeria.beans.pizzaYourself;

import javax.persistence.*;

@Entity
@Table(name = "yourselfpizza_ingredients", schema = "pizzeria", catalog = "")
public class YourselfpizzaIngredientsEntity {
    private int id;
    private int idYourselfPizza;
    private int idIngredients;
    private int quantity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idYourselfPizza", nullable = false)
    public int getIdYourselfPizza() {
        return idYourselfPizza;
    }

    public void setIdYourselfPizza(int idYourselfPizza) {
        this.idYourselfPizza = idYourselfPizza;
    }

    @Basic
    @Column(name = "idIngredients", nullable = false)
    public int getIdIngredients() {
        return idIngredients;
    }

    public void setIdIngredients(int idIngredients) {
        this.idIngredients = idIngredients;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YourselfpizzaIngredientsEntity that = (YourselfpizzaIngredientsEntity) o;

        if (id != that.id) return false;
        if (idYourselfPizza != that.idYourselfPizza) return false;
        if (idIngredients != that.idIngredients) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idYourselfPizza;
        result = 31 * result + idIngredients;
        result = 31 * result + quantity;
        return result;
    }
}
