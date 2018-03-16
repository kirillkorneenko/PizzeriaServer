package by.bsuir.pizzeria.beans;

import javax.persistence.*;

@Entity
@Table(name = "pizza_ingredients", schema = "pizzeria", catalog = "")
public class PizzaIngredientsEntity {
    private int id;
    private int idPizza;
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
    @Column(name = "idPizza", nullable = false)
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
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

        PizzaIngredientsEntity that = (PizzaIngredientsEntity) o;

        if (id != that.id) return false;
        if (idPizza != that.idPizza) return false;
        if (idIngredients != that.idIngredients) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idPizza;
        result = 31 * result + idIngredients;
        result = 31 * result + quantity;
        return result;
    }
}
